package hust.soict.dsai.aims.media;

public class Track implements Playable {
	//attributes
	private String title;
	private int length;
	
	//contructors
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	//getter and setter for title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	//getter and setter for length
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
    //method to play the track
	public void play() {
		System.out.println("BaoPhuc-Playing track: " + this.getTitle());
		System.out.println("BaoPhuc-Track length: " + this.getLength());
	}
}
