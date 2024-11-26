public class StoreTest {
    
    public static void main(String[] args){
        Store store = new Store();
    
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("BaoPhuc-The Lion King",
                    "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);
            
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("BaoPhuc-Star Wars", 
                    "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);
            
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("BaoPhuc-Aladin",
                    "Animation", 18.99f);
        store.addDVD(dvd3);
            
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("BaoPhuc-Two broke girls",
                    "Comedy", "BaoPhuc", 22.22f);
        store.addDVD(dvd4);
        
        store.removeDVD(dvd3);
        store.removeDVD(dvd2);
    }
}

