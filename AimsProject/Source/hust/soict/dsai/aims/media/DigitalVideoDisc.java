package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    //attributes extends Disc

    //constructors
	public DigitalVideoDisc( String title) {
		super( title);
	}
    public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
        this( title, category, cost);
        this.setDirector(director);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
    	this(title);
    	this.setCategory(category);
    	this.setCost(cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	this(title, category, cost);
    	this.setDirector(director);
    	this.setLength(length);
    }
    //method to print details of DVD
    @Override
    public void print() {
    	System.out.println(getId() + " BaoPhuc-DVD"
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
    
    //play GUI
    public String playGUI() {
        return "Playing DVD: " + this.getTitle() + "\n" + 
                "DVD length: " + formatDuration(this.getLength());
    }
}