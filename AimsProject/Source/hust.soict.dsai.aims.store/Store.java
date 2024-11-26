public class Store {
    private static final int MAX_NUMBERS_IN_STORE = 100; 
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_NUMBERS_IN_STORE) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("BaoPhuc-DVD '" + dvd.getTitle() + "' has been added to the store.");
        } else {
            System.out.println("BaoPhuc-The store is full. Cannot add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].getId() == dvd.getId()) {
                found = true;
                // Dịch chuyển các DVD sau DVD cần xóa lên một vị trí
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null; // Xóa đối tượng thừa
                qtyInStore--;
                System.out.println("BaoPhuc-DVD '" + dvd.getTitle() + "' has been removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println("BaoPhuc-DVD '" + dvd.getTitle() + "' was not found in the store.");
        }
    }
}
