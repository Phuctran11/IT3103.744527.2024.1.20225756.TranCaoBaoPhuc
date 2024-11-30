package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
    //attributes
    private String director;
    private int length;

    //constructors
    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    public DigitalVideoDisc(int id, String title, String category, String director, float cost) {
        super(id, title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public DigitalVideoDisc(int id,String title) {
        super(id, title);
    }
    //getter and setter for director
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    //`getter and setter for length
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

}