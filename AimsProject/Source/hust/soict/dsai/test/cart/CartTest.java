package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;

public class CartTest {
    public static void main(String[] args){
    Cart cart = new Cart();

    DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"BaoPhuc-The Lion King","Animation", "Roger Allers", 87, 19.95f);
	cart.addMedia(dvd1);
		
	DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"BaoPhuc-Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
	cart.addMedia(dvd2);
		
	DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"BaoPhuc-Aladin",
				"Animation", 18.99f);
	cart.addMedia(dvd3);
		
	DigitalVideoDisc dvd4 = new DigitalVideoDisc(4,"BaoPhuc-Two broke girls",
				"Comedy", "BaoPhuc", 50,22.22f);
	cart.addMedia(dvd4);

    cart.print();
    cart.searchByTitle("BaoPhuc-The Lion King");
    cart.searchByTitle("BaoPhuc-Two broke girls");
    cart.searchById(2);
    cart.searchById(5);
    }
}
