package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    //attributes extends Disc

    //constructors
	public DigitalVideoDisc(int id, String title) {
		super(id, title);
	}
    public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
        this(id, title, category, cost);
        this.setDirector(director);
    }
    public DigitalVideoDisc(int id, String title, String category, float cost) {
    	this(id, title);
    	this.setCategory(category);
    	this.setCost(cost);
    }
    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
    	this(id, title, category, cost);
    	this.setDirector(director);
    	this.setLength(length);
    }
    //method to print details of DVD
    @Override
    public void print() {
    	System.out.println(getId() + "BaoPhuc-DVD"
    						+ "-" + getTitle()
    						+ "-" + getCategory()
    						+ "-" + getDirector()
    						+ "-" + getLength()
    						+ "-" + getCost() + "$");
    	
    }
    //method to play a DVD
    public void play() {
    	System.out.println("BaoPhuc-Playing DVD: " + this.getTitle());
    	System.out.println("BaoPhuc-DVD's length: " + this.getLength());
    }
}