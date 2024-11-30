package hust.soict.dsai.aims.media;

public class Track {
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
}
