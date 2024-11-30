package hust.soict.dsai.aims.media;

public class Disc extends Media{
	private int length;
	private String director;
	
	//construtors
	public Disc(int id, String title) {
		super(id, title);
	}
	public Disc(int id, String title, String category, float cost, String director, int length) {
		super(id, title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	//getter and setter for director
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	//getter and setter for length
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
}
