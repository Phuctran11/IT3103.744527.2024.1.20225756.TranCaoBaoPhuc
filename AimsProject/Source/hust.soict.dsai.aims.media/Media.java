package aims;


public abstract class Media{
    //attributes
    private int id;
    private String title;
    private String category;
    private float cost;

    //constructor
    public Media(int id, String title){
        this.id = id;
        this.title = title;
    }

    public Media(int id, String title, String category, float cost){
        this.id = id;
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
    	return getTitle() == title;
    }

}