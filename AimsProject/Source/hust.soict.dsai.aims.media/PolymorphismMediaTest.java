package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismMediaTest {
	public static void main(String[] args) {
		List<Media> media = new ArrayList<>();
		CompactDisc cd = new CompactDisc(1,"BP-CD1", "Fantasy", 13F, "Lucas", 123, "John");
		DigitalVideoDisc dvd = new DigitalVideoDisc(2, "BP-DVD Title1", "Action", "BaoPhuc", 120, 15.99f);
		Book b = new Book(3, "BP-Dragon Ball", "Action", 10F);
		
		media.add(cd);
		media.add(dvd);
		media.add(b);
		
		for (Media m : media) {
			System.out.println(m.toString());
		}
		
	}
}
