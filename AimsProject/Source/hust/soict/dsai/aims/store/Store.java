package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;
import java.util.List;

public class Store {
	//attributes
    private List<Media> itemsInStore = new ArrayList<Media>();
    public Store() {
    	
    }
    //method to add new Media into Store
    public void addMedia(Media media) {
		if (itemsInStore.contains(media)) {
            System.out.println("BaoPhuc-" + media.getTitle() + " is already in the cart!");
        } else {
            itemsInStore.add(media);
        System.out.println("BaoPhuc-Add the meida successfully!");
        }
	}
    //method to remove the media from store
    public void removeMedia(Media media) {
        int found = itemsInStore.indexOf(media);
        
        if ( found >= 0) {
        	itemsInStore.remove(found);
        	System.out.println("BaoPhuc-Remove the media successfully!");
        } else {
        	System.out.print("BaoPhuc-Can not found to remove the media in Store!");
        }
    }  
    //getter and setter for media
    public List<Media> getItemsInStore(){
    	return itemsInStore;
    }
    public void setItemsInStore(List<Media> itemsInStore) {
    	this.itemsInStore = itemsInStore;
    }
    //method to print
    public void print(){
        System.out.println("***********************ITEMS IN STORE***********************");
        for (Media media : itemsInStore) {
        	media.print();
        }
        System.out.println("************************************************************");
    }
    //method to search items in store by id and title
    public Media searchItemsById(int id) {
    	for (Media media : itemsInStore) {
    		if(media.getId() == id) {
    			return media;
    		}
    	}
    	return null;
    }
    public Media searchItemsByTitle(String title) {
    	for (Media media : itemsInStore) {
    		if(media.getTitle().equalsIgnoreCase(title)) {
    			return media;
    		}
    	}
    	return null;
    }
}
