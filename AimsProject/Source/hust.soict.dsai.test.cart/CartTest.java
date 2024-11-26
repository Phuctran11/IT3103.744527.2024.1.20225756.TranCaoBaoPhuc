public class CartTest {
    public static void main(String[] args){
    Cart cart = new Cart();

    DigitalVideoDisc dvd1 = new DigitalVideoDisc("BaoPhuc-The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
	cart.addDigitalVideoDisc(dvd1);
		
	DigitalVideoDisc dvd2 = new DigitalVideoDisc("BaoPhuc-Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
	cart.addDigitalVideoDisc(dvd2);
		
	DigitalVideoDisc dvd3 = new DigitalVideoDisc("BaoPhuc-Aladin",
				"Animation", 18.99f);
	cart.addDigitalVideoDisc(dvd3);
		
	DigitalVideoDisc dvd4 = new DigitalVideoDisc("BaoPhuc-Two broke girls",
				"Comedy", "BaoPhuc", 22.22f);
	cart.addDigitalVideoDisc(dvd4);

    cart.print();
    cart.searchDVD("BaoPhuc-The Lion King");
    cart.searchDVD("BaoPhuc-Two broke girls");
    cart.searchDVD(2);
    cart.searchDVD(5);
    }
}
