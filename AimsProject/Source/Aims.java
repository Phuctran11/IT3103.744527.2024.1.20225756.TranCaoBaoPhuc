

public class Aims {

	public static void main(String[] args) {
		Cart Cart = new Cart(); 
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Pursuit Of Happiness", "Slice Of Life","Gabriele Muccino", 120, 24.95f);
		Cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Queen's Gambit", "Fantasy","Michelle Tesoro", 120, 29.99f);
		Cart.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Homelander", "The Boys", 20.99f);
		Cart.addDigitalVideoDisc(dvd3);
		
		Cart.removeDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost is: ");
		System.out.println(Cart.totalCost());
	}

}
