public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store();
		
		//make new dvds
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		// Test addDVD method
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Print items in the store
        System.out.println("\nItems in store:");
        store.print();

        // Test removeDVD method
        store.removeDVD(dvd2);

        // Print items in the store after removal
        System.out.println("\nItems in store after removal:");
        store.print();

	}

}