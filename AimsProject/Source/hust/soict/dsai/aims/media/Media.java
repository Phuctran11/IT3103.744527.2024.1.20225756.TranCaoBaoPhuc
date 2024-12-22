package hust.soict.dsai.aims.media;

import java.time.Duration;

import java.util.Comparator;

import exception.PlayerException;

public abstract class Media implements Comparable<Media>{
    @Override
    public int compareTo(Media media) {
        //compare by title
        int titleComparison =  this.getTitle().compareTo(media.getTitle());

        //if title is the same, compare by cost
        return (titleComparison == 0) ? Float.compare(this.getCost(), media.getCost()) : titleComparison;

    }
    //attributes
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia = 0;
    //constructor
    public Media( String title){
        this.id = ++nbMedia;
        this.title = title;
    }

    public Media(String title, String category, float cost){
        this.id = ++nbMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
    //getter and setter for id
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //getter and setter for title
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    //getter and setter for category
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    //getter and setter for cost
    public float getCost(){
        return cost;
    }
    public void setCost(float cost){
        this.cost = cost;
    }
    //method to print
    public void print(){
        System.out.println("BaoPhuc-Media: " + getTitle() 
        					+ " - " + getCategory() 
        					+ " - " + getCost() + "$");
    }
    //method to check if is right title
    public boolean isMatch(String title) {
    	return getTitle().toLowerCase().contains(title.toLowerCase());
    }
    //method to play
    public void play() {
        System.out.println("BaoPhuc-Playing media " +getTitle());
    }
    //method to play GUI
    public String playGUI() throws PlayerException {
        return "BaoPhuc-Playing media " +getTitle();
    }
    //method to check identical objects
    public boolean equals(Object o) {
    	Media media = (Media) o;
    	try {
    		String title = media.getTitle();
    		return title.equals(this.getTitle());
    	} catch (NullPointerException e) {
    		return false;
    	}
    }
    //method toString- polymorphism 
    public String toString(){
        return "BaoPhuc-Media{" +
                "id= "+ id +
                ", title= " + title +
                ", category= " + category+
                ", cost= " + cost +
                "}";
    }
    //comparator class
    public static final Comparator<Media> COMPARE_BY_TITILE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITILE = new MediaComparatorByCostTitle();

    public String formatDuration(int durationInSeconds) {
        Duration duration = Duration.ofSeconds(durationInSeconds);
        return String.format("%02d:%02d", duration.toMinutes(), duration.minusMinutes(duration.toMinutes()).getSeconds());
    }
}