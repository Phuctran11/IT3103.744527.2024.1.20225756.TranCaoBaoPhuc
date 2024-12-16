package hust.soict.dsai.aims.screen;
import hust.soict.dsai.aims.store.*;
import hust.soict.dsai.aims.media.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StoreScreen extends JFrame{
    private Store store;

    public void Storescreen(Store store){
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024,768);
        setVisible(true);
    }

    JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north , BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;

    }

    JMenuBar createMenuBar(){
        JMenu menu = new JMenu("BP-Options");

        JMenu smUpdateStore = new JMenu("BP-Update store");
        smUpdateStore.add(new JMenuItem("BP-Add Book"));
        smUpdateStore.add(new JMenuItem("BP-Add CD"));
        smUpdateStore.add(new JMenuItem("BP-Add DVD"));

        menu.add( smUpdateStore);
        menu.add(new JMenuItem("BP-View store"));
        menu.add(new JMenuItem("BP-View cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;

    }

    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title =  new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart =  new JButton("BP-View cart");
        cart.setPreferredSize(new Dimension(125, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10,10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10,10)));

        return header;
    }

    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout((new GridLayout(3,3,2,2)));
        
        ArrayList<Media> mediaInStore = (ArrayList<Media>) store.getItemsInStore();
        for(int i=0; i<9; i++){
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }
    public static void main(String[] args) {
        Store store = new Store();
        //add book
        store.addMedia(new Book(1, "BP-Book1", "BP-Category1", 10.0f));
        store.addMedia(new Book(2, "BP-Book2", "BP-Category2", 20.0f));
        store.addMedia(new Book(3, "BP-Book3", "BP-Category3", 30.0f));
        store.addMedia(new Book(4, "BP-Book4", "BP-Category4", 40.0f));
        store.addMedia(new Book(5, "BP-Book5", "BP-Category5", 50.0f));
        //add cd
        store.addMedia(new CompactDisc(6, "BP-CD1", "BP-Category1", 10.0f, "BP-CD1-Director", 20, "BP-CD1-Artist"));
        store.addMedia(new CompactDisc(7, "BP-CD2", "BP-Category2", 20.0f, "BP-CD2-Director", 30, "BP-CD2-Artist"));
        //add dvd
        store.addMedia(new DigitalVideoDisc(8, "BP-DVD1", "BP-Category1", 10.0f, "BP-DVD1-Director", 20));
        store.addMedia(new DigitalVideoDisc(9, "BP-DVD2", "BP-Category2", 20.0f, "BP-DVD2-Director", 30));

        new StoreScreen().Storescreen(store);
    }
}
