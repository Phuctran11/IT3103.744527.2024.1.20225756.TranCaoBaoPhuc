package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    
    public static void main(String[] args){
        Store store = new Store();
    
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"BaoPhuc-The Lion King",
                    "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);
            
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"BaoPhuc-Star Wars", 
                    "Science Fiction", "George Lucas", 87, 24.95f);
        store.addMedia(dvd2);
            
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"BaoPhuc-Aladin",
                    "Animation", 18.99f);
        store.addMedia(dvd3);
            
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(4,"BaoPhuc-Two broke girls",
                    "Comedy", "BaoPhuc", 50, 22.22f);
        store.addMedia(dvd4);
        
        store.removeMedia(dvd3);
        store.removeMedia(dvd2);
    }
}

