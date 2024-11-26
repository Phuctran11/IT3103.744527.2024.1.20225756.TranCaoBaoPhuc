
public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("BaoPhuc-The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("BaoPhuc-Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("BaoPhuc-Aladin",
				"Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("BaoPhuc-Two broke girls",
				"Comedy", "BaoPhuc", 22.22f);
		anOrder.addDigitalVideoDisc(dvd4);
		 
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("BaoPhuc-the big bang theory",
				"Comedy", "BaoPhuc", 22.22f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("BaoPhuc-joker",
				"Comedy", "BaoPhuc", 22.22f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("BaoPhuc-Evengers",
				"Comedy", "BaoPhuc", 22.22f);

		DigitalVideoDisc[] dvdList ={dvd5, dvd6, dvd7};
		anOrder.addDigitalVideoDisc(dvdList); //overloading

		anOrder.addDigitalVideoDisc(dvd1, dvd2); //Truyền 2 tham số
		
		// anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7); //Truyền nhiều tham số

		System.out.println("Total cost is:");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd3);
		
		System.out.println("Total cost is:");
		System.out.println(anOrder.totalCost());
		
		
	}
}