package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    //chỉ cần tạo thuộc tính list tác giả do đã kế thừa lớp Media
    private List<String> authors = new ArrayList<String>();
    
    public Book(int id, String title){
        super(id, title);
    }

    public Book(int id, String title, String category, float cost){
        super(id, title, category, cost);
    }

    //adding new author method
    //if the new author is already in the list, return false; otherwise add the news and display success message
    public void addAuthor(String authorName){
        if (authors.contains(authorName)){
            System.out.println("BaoPhuc-The author is already in the list!");
        } else{
            authors.add(authorName);
            System.out.println("BaoPhuc-Add the new author successfully!");
        }
    }


    //removing author method
    //if the author is in the list, remove it and display success message; otherwise display error message
    public void removeAuthor(String authorName){
        if (authors.contains(authorName)){
            authors.remove(authorName);
            System.out.println("BaoPhuc-Remove the author successfully!");
        } else{
            System.out.println("BaoPhuc-The author is not in the list!");
        }
    }

    //getter and setter for authors
    public List<String> getAuthors(){
        return authors;
    }

    public void setAuthors(List<String> authors){
        this.authors = authors;
    }

    //Printing the list of authors method
    @Override
    public void print(){
        System.out.print(getId() + " BaoPhuc-Book "+
                            getTitle() + " - "+
                            getCategory() + " - ");
        for(String author: authors){
            System.out.print(author + "-");
        }
        System.out.println(getCost() + "$");
    }

} 