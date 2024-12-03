package hust.soict.dsai.aims;
import hust.soict.dsai.aims.media.DigitalVideoDisc; 
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.cart.Cart;

import java.util.Scanner;

public class Aims {
	private static Store store =  new Store();
	private static Cart cart = new Cart();
	
	public static void main(String[] args) {
		initSetup();
		boolean exit = false;
		while (!exit) {
            //show the option menu
            showMenu();

            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();

            switch (option) {
                case "0":
                    exit = true;
                    System.out.println("BaoPhuc-Good bye!");
                    break;
                case "1":
                    clearConsole();
                    storeMenu(scanner);//view store
                    break;
                case "2":
                    clearConsole();
                    updateStoreMenu(scanner);//update store
                    break;
                case "3":
                    clearConsole();
                    cartMenu(scanner);//see current cart
                    break;
                default:
                    clearConsole(); 
                    System.out.println("BaoPhuc-Invalid option, please choose again.");
                    break;
            }

        }

    }
    public static void clearConsole() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }
    // init store setup 
    public static void initSetup() {

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King", "Animation", "Roger Allers", 87, 19.95f);     
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star War", "Science Fiction", "George Lucas", 87, 24.95f); 
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin", "Animation", 18.99f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

    
        Book book = new Book(4,"The Valley of Fear", "Detective", 20.00f);
        Book book1 = new Book(5,"A Living Remedy: A Memoir", "Biography", 202.00f);
        Book book2 = new Book(6,"On the Origin of Time: Stephen Hawking's Final Theory", "Science", 120.00f);
        store.addMedia(book);
        store.addMedia(book1);
        store.addMedia(book2);


        CompactDisc cd1 = new CompactDisc(7,"Adele - 30", "Music", 1500.98f, "Paul", 10, "Adele");
        Track track1CD1 = new Track("All Night Parking (interlude)", 161);
        Track track2CD1 = new Track("To Be Loved", 403);
        Track track3CD1 = new Track("Woman Like Me", 300);
        cd1.addTrack(track1CD1);
        cd1.addTrack(track2CD1);
        cd1.addTrack(track3CD1);

        CompactDisc cd2 = new CompactDisc(8,"The Gods We Can Touch", "Music", 2000.22f, "Cristopher", 20, "Aurora");
        Track track1CD2 = new Track("Everything Matters", 180+34);
        Track track2CD2 = new Track("Blood in the Wine", 180+30);
        Track track3CD2 = new Track("Artemis", 60*2+39);
        cd2.addTrack(track1CD2);
        cd2.addTrack(track2CD2);
        cd2.addTrack(track3CD2);

        CompactDisc cd3 = new CompactDisc(9, "Purpose", "Music", 1000.98f, "JB", 15, "Justin Bieber");
        Track track1CD3 = new Track("The Feeling", 4*60+5);
        Track track2CD3 = new Track("No Sense", 4*60+35);
        cd3.addTrack(track1CD3);
        cd3.addTrack(track2CD3);

        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(cd3);
        
//        clearConsole();
    }
    
    // Print method
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    //view option in Store
    public static void storeMenu(Scanner scanner) {
        boolean back = false; //if user want to back the menu option, back is true
        while (!back) {
            store.print();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            String option = scanner.nextLine();
            switch (option) {
                case "0":
                    clearConsole();
                    back = true;
                    break;
                case "1"://see a media's details
                    boolean foundDetails = false;
                    while (!foundDetails) {
                        System.out.println("BaoPhuc-Enter the title of the media (type 0 to stop): ");
                        String title = scanner.nextLine();
                        if (title.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = store.searchItemsByTitle(title);
                        if (media != null) {
                            clearConsole();
                            System.out.println("Details: ");
                            System.out.println(media);
                            mediaDetailsMenu(scanner, media);
                            foundDetails = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    }
                    break;
                case "2"://add media to cart
                    boolean foundToAdd = false;
                    while (!foundToAdd) {
                        System.out.println("BaoPhuc-Enter the title of the media (type 0 to stop): ");
                        String title = scanner.nextLine();
                        if (title.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = store.searchItemsByTitle(title);
                        if (media != null) {
                            cart.addMedia(media);
                            foundToAdd = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    }
                    break;
                case "3"://play a media
                    boolean foundToPlay = false;
                    while (!foundToPlay) {
                        System.out.println("BaoPhuc-Enter the title of the media (type 0 to stop): ");
                        String title = scanner.nextLine();
                        if (title.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = store.searchItemsByTitle(title);
                        if (media != null) {
                            if (media instanceof Disc || media instanceof CompactDisc) {
                                media.play();
                                clearConsole();
                            } else {
                                System.out.println("BaoPhuc-Sorry!This type of media is not supported!");
                            }
                            foundToPlay = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    }
                    break;
                case "4"://see current cart
                    clearConsole(); 
                    cartMenu(scanner);
                    break;    
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
    //if user continue to enter option 1 - see a media's details
    public static void mediaDetailsMenu(Scanner scanner, Media media) {
        boolean back = false;
        while (!back) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            String option = scanner.nextLine();
            switch (option) {
                case "0"://back to store menu
                    clearConsole(); 
                    back = true;
                    break;
                case "1":
                    cart.addMedia(media);
                    break;
                case "2":
                    if (media instanceof Disc || media instanceof CompactDisc) {
                        media.play();
                    } else {
                        System.out.println("This type of media is not supported!");
                    }
                    break;
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
    //if user choose option 4th to see current cart
    public static void cartMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            cart.print();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            String option = scanner.nextLine();
            switch (option) {
                case "0"://back to store menu
                    clearConsole(); 
                    back = true;
                    break;
                case "1"://filter medias
                    System.out.println("BP-Filter medias in cart by (1) id or (2) title:");
                    int filterOption = scanner.nextInt();
                    boolean found = false;
                    while (!found) {
                        if (filterOption == 1) {//filter by id
                            System.out.println("BP-Enter the id to filter (type 0 to stop):");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            if (id == 0) {
                                clearConsole();
                                break;
                            }
                            cart.searchById(id);
                            clearConsole();
                            found = true;
                        } else if (filterOption == 2) {//filter by title
                            System.out.println("BP-Enter the title to filter (type 0 to stop):");
                            String title = scanner.nextLine();
                            scanner.nextLine();
                            if (title.equals("0")) {
                                clearConsole();
                                break;
                            }
                            cart.searchByTitle(title);
                            clearConsole();
                            found = true;
                        } else if (filterOption == 0) {
                            clearConsole();
                            break;
                        } else {
                            System.out.println("Sorry! Invalid option.");
                        }
                    }
                    break;
                case "2"://sort medias in cart
                    System.out.println("BP-Sort medias in cart by (1) title or (2) cost:");
                    int sortOption = scanner.nextInt();
                    scanner.nextLine();
                    if (sortOption == 1) {
                        cart.sortMediaByTitle();
                    } else if (sortOption == 2) {
                        cart.sortMediaByCost();
                    } else {
                        System.out.println("BP-Sorry! Invalid option.");
                    }
                    break;
                case "3"://remove media from cart
                    boolean foundToRemove = false;
                    while (!foundToRemove) {
                        System.out.println("BP-Enter the title of the media (type 0 to stop): ");
                        String title = scanner.nextLine();
                        if (title.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = cart.searchToRemove(title);
                        if (media != null) {
                            clearConsole();
                            cart.removeMedia(media);
                            foundToRemove = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    } 
                    break;
                case "4"://play a media
                    boolean foundToPlay = false;
                    while (!foundToPlay) {
                        System.out.println("Enter the title of the media (type 0 to stop): ");
                        String titlePlay = scanner.nextLine();
                        if (titlePlay.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = store.searchItemsByTitle(titlePlay);
                        if (media != null) {
                            if (media instanceof Disc || media instanceof CompactDisc) {
                                media.play();
                            } else {
                                System.out.println("BP-This type of media is not supported!");
                            }
                            foundToPlay = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    }
                    break; 
                case "5"://place order
                    clearConsole();
                    cart.empty();
                    break;
                default:
                    clearConsole(); 
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
    public static void updateStoreMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media to the store");
            System.out.println("2. Remove a media from the store");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            String option = scanner.nextLine();
            switch (option) {
                case "0"://when user want to back
                    clearConsole();
                    back = true;
                    break;
                case "1"://when user want to add new media
                    System.out.println("Enter the media type (1) Book, (2) CD, (3) DVD or (0) exit:");
                    int categoryChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (categoryChoice == 1) { //add book
                    	System.out.println("Enter book ID:");
                    	int bookId = scanner.nextInt();
                        System.out.println("Enter book title: ");
                        String bookTitle = scanner.nextLine();
                        System.out.println("Enter book category: ");
                        String bookCategory = scanner.nextLine();
                        System.out.println("Enter book cost: ");
                        Float bookCost = scanner.nextFloat();
                        
                        Book newBook = new Book(bookId, bookTitle, bookCategory, bookCost);
                        store.addMedia(newBook);
                    } else if (categoryChoice == 2) {//add CD
                    	System.out.println("Enter CD ID: ");
                    	int cdId = scanner.nextInt();
                        System.out.println("Enter CD title: ");
                        String cdTitle = scanner.nextLine();
                        System.out.println("Enter CD category: ");
                        String cdCategory = scanner.nextLine();
                        System.out.println("Enter CD cost: ");
                        Float cdCost = scanner.nextFloat();
                        System.out.println("Enter CD director: ");
                        String cdDirector = scanner.nextLine();
                        System.out.println("Enter CD length: ");
                    	int cdLength = scanner.nextInt();
                        System.out.println("Enter CD artist: ");
                        String cdArtist = scanner.nextLine();
                        
                        scanner.nextLine();

                        CompactDisc newCD = new CompactDisc(cdId,cdTitle, cdCategory, cdCost, cdDirector, cdLength, cdArtist);

                        
                        System.out.println("Do you want to add tracks to your CD? (1) Yes (0) No:");
                        int addTrack = scanner.nextInt();
                        scanner.nextLine();
                        
                        if (addTrack == 1) {
                            System.out.println("How many tracks in your CD?");
                            int numTrack = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < numTrack; i++) {
                                System.out.println("Your " + (i+1) + " track: ");
                                System.out.println("Enter track title: ");
                                String trackTitle = scanner.nextLine();
                                System.out.println("Enter track length: ");
                                int trackLength = scanner.nextInt();
                                scanner.nextLine();

                                Track newTrack = new Track(trackTitle, trackLength);
                                newCD.addTrack(newTrack);
                            }
                            store.addMedia(newCD);
                        } else if (addTrack == 0) {
                            store.addMedia(newCD);
                        }
                    } else if (categoryChoice == 3) {//add DVD
                    	System.out.println("Enter DVD ID:");
                    	int dvdId = scanner.nextInt();
                        System.out.println("Enter DVD title: ");
                        String dvdTitle = scanner.nextLine();
                        System.out.println("Enter DVD category: ");
                        String dvdCategory = scanner.nextLine();
                        System.out.println("Enter CD director: ");
                        String dvdDirector = scanner.nextLine();
                        System.out.println("Enter CD length: ");
                    	int dvdLength = scanner.nextInt();
                        System.out.println("Enter book cost: ");
                        Float dvdCost = scanner.nextFloat();
                        scanner.nextLine();
                        
                        DigitalVideoDisc newDVD = new DigitalVideoDisc(dvdId, dvdTitle, dvdCategory, dvdDirector, dvdLength,dvdCost);
                        store.addMedia(newDVD);                
                    } else if (categoryChoice == 0) {
                        clearConsole();
                        break;
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;
                case "2"://remove media
                    boolean foundToRemove = false;
                    while (!foundToRemove) {
                        System.out.println("BP-Enter the title of the media (type 0 to stop): ");
                        String title = scanner.nextLine();
                        if (title.equals("0")) {
                            clearConsole();
                            break;
                        }
                        Media media = store.searchItemsByTitle(title);
                        if (media != null) {
                            clearConsole();
                            store.removeMedia(media);
                            foundToRemove = true;
                        } else {
                            System.out.println("***MEDIA NOT FOUND***");
                        }
                    }
                    break;
                default: //back
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
}
	