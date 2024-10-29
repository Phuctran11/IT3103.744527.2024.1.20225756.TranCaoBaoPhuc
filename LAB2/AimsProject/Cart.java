package aims;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("BaoPhuc-The disc has been added: " + disc.getTitle());
        } else {
            System.out.println("BaoPhuc-The cart is almost full.");
        }
    }

    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getTitle().equals(disc.getTitle())) { //so sánh qua tên sản phẩm
                found = true;
                //dịch chuyển các sản phẩm sau sản phẩm cần xóa lên 1 đơn vị
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[qtyOrdered - 1] = null; //xóa đối tượng thừa
                qtyOrdered--;
                System.out.println("BaoPhuc-The disc has been removed: " + disc.getTitle());
                break;
            }
        }
        if (found ==  false) {
            System.out.println("BaoPhuc-The disc was not found in the cart.");
        }
    }

    
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }
}
