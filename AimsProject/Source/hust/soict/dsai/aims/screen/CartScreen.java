package hust.soict.dsai.aims.screen;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;
public class CartScreen extends JFrame {
    private Cart cart;

    public CartScreen(Cart cart) {
        super();
        this.cart = cart;
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Cart");
        this.setVisible(true);

        this.setSize(new Dimension(1024, 768));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/screen/cart.fxml"));
                    CartScreenController controller = new CartScreenController(cart); // Pass the cart object
                    loader.setController(controller); // Set the controller programmatically
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    fxPanel.setScene(scene);


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public static void main(String[] args)  {
        Cart cart = new Cart();
        // Compact Discs
        CompactDisc cd = new CompactDisc( "Yunomi's Vol4 CD", "Music", 10.99f, "Yunomi", 180, "Yunomi");
        CompactDisc cd1 = new CompactDisc( "BaoPhucLife", "Pop", 12.99f, "Aimer", 170, "Aimer");
        CompactDisc cd2 = new CompactDisc( "HappyLife", "Remix", 8.99f, "Various Artists", 200, "Various");
        CompactDisc cd3 = new CompactDisc( "My heart will go on ", "Jazz", 14.99f, "Norah Jones", 240, "Norah Jones");
        CompactDisc cd4 = new CompactDisc( "I have no enemies", "Classical", 9.99f, "Ludwig Orchestra", 120, "Beethoven");
        CompactDisc cd5 = new CompactDisc( "Sky", "Pop", 200.0f, "Son Tung MTP", 2024, "MTP");

// Digital Video Discs
        DigitalVideoDisc dvd = new DigitalVideoDisc( "Shigatsu wa kimi no uso", "Music", 11.99f, "Hatsune Miku", 123);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc( "Interstellar", "Sci-fi", 19.99f, "Christopher Nolan", 169);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc( "Inception", "Thriller", 17.99f, "Christopher Nolan", 148);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc( "The car world", "Animation", 14.99f, "Disney", 103);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc( "The Matrix", "Action", 12.99f, "Lana Wachowski", 136);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc( "The Mini House", "Comedy", 50.0f, "BaoPhuc", 200);

// Books
        Book book = new Book("The Wandering Earth", "Sci-fi", 9.99f);
        Book book1 = new Book("1984", "Dystopian", 8.99f);
        Book book2 = new Book("To Kill a Mockingbird", "Classic", 7.99f);
        Book book3 = new Book("The Hobbit", "Fantasy", 10.49f);
        Book book4 = new Book("Adersen's Story", "Classic", 6.99f);
        Book book5 = new Book("Journey to the East", "Book", 99.0f);
        Cart.addMedia(cd);
        Cart.addMedia(cd1);
        Cart.addMedia(cd2);
        Cart.addMedia(cd3);
        Cart.addMedia(cd4);
        
        

        Cart.addMedia(dvd);
        Cart.addMedia(dvd2);
        Cart.addMedia(dvd3);
        Cart.addMedia(dvd4);
        Cart.addMedia(dvd1);
        
        
        Cart.addMedia(book);
        Cart.addMedia(book1);
        Cart.addMedia(book2);
        Cart.addMedia(book3);
        Cart.addMedia(book4);

        new CartScreen(cart);
    }
}