package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Cart {
	//attributes
	private List<Media> itemOrdered = new ArrayList<Media>();
	
	public Cart() {
		
	}
	//method to add a new media 
	public void addMedia(Media media) {
		if (itemOrdered.contains(media)) {
            System.out.println("BaoPhuc-" + media.getTitle() + " is already in the cart!");
        } else {
            itemOrdered.add(media);
            System.out.println("BaoPhuc-Add the new media " + media.getTitle() + " successfully!");
        }
	}
	
	//method to remove media 
	public void removeMedia(Media media) {
		int check = itemOrdered.indexOf(media);//check if the media is already in list itemOrdered
		
		if(check >= 0) {
			itemOrdered.remove(check);
			System.out.println("BaoPhuc-Remove the media successfully!");
		} else {
			System.out.print("BaoPhuc-The media is not in the cart!");
		}
	}
	
	//method to calculate the sum of Media in Cart
	public double totalCost() {
		float cost = 0;
		for (Media media : itemOrdered) {
			cost += media.getCost();
		}
		return Math.round(cost * 100.0) / 100.0;
		// Làm tròn chi phí tổng cộng đến hai chữ số thập phân
	}
	//method to print the list of itemOrdered
	public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media : itemOrdered) {
        	media.print();
        }
        System.out.println("BaoPhuc - Total Cost: " + totalCost());
        System.out.println("**************************************************");
    }
	//method to search media in Cart by Id
	public void searchById(int id){
        boolean found = false;
        for (Media media : itemOrdered) {
        	if (media.getId() == id) {
        		found = true;
        		media.print();
        	}
        }
        if (found == false) {
        	System.out.println("BaoPhuc-Not found the media!");
        }
    }
	//method to search media in Cart by Title
	public void searchByTitle(String title) {
		boolean found = false;
		for (Media media : itemOrdered) {
			if (media.isMatch(title)) {
				found = true;
				media.print();
			}
		}
		if (found == false) {
			System.out.println("BaoPhuc-Not found the media!");
		}
	}
	//method to sort media by title
	public void sortMediaByTitle() {
		Collections.sort((List<Media>)itemOrdered, Media.COMPARE_BY_TITILE_COST);
		Iterator<Media> iterator = itemOrdered.iterator();
		iterator = itemOrdered.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(((Media)iterator.next()).toString());
		}
	}
	//method to sort media by cost
	public void sortMediaByCost() {
        Collections.sort((List<Media>)itemOrdered, Media.COMPARE_BY_COST_TITILE);
        Iterator<Media> iterator = itemOrdered.iterator();
        iterator = itemOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
	//method search to remove
	public Media searchToRemove(String title) {
		for (Media media : itemOrdered) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}
	//method to place order
	public void empty() {
        if (itemOrdered.size() == 0) {
            System.out.println("BP-Nothing to remove!");
        } else {
            itemOrdered.clear();
            System.out.println("BP-Order created.");
            System.out.println();
        }
    }
	
	
}
