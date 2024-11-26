
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private int qtyOrdered = 0;
    DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("BaoPhuc-The disc having the id " + disc.getId() +" has been added: " + disc.getTitle());
        } else {
            System.out.println("BaoPhuc-The cart is almost full.");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for(DigitalVideoDisc dvd : dvdList){
            if (qtyOrdered < MAX_NUMBERS_ORDERED){
                itemOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("BaoPhuc - The disc has the id "+ dvd.getId() +" has been added: " + dvd.getTitle());
            } else{
                System.out.println("BaoPhuc - The cart is almost full.");
                break;
            }
        }
    }

    //phương thức truyền 2 tham số
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if (qtyOrdered < MAX_NUMBERS_ORDERED){
            itemOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("BaoPhuc - The disc "+ qtyOrdered +"th has been added: " + dvd1.getTitle());
        } else{
            System.out.println("BaoPhuc - The cart is almost full.");
        }
        if (qtyOrdered < MAX_NUMBERS_ORDERED){
            itemOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("BaoPhuc - The disc "+ qtyOrdered +"th has been added: " + dvd2.getTitle());
        } else{
            System.out.println("BaoPhuc - The cart is almost full.");
        }
    }

    //Phương thức truyền nhiều tham số

    // public void addDigitalVideoDisc(DigitalVideoDisc... discs) {
    //     for (DigitalVideoDisc disc : discs) {
    //         if (qtyOrdered < MAX_NUMBERS_ORDERED) {
    //             itemOrdered[qtyOrdered] = disc;
    //             qtyOrdered++;
    //             System.out.println("BaoPhuc-The disc has been added: " + disc.getTitle());
    //         } else {
    //             System.out.println("BaoPhuc-The cart is almost full.");
    //             break;
    //         }
    //     }
    // }

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
    //phương thức in thông tin giỏ hàng
    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i = 0; i<qtyOrdered; i++){
            System.out.println((i+1) + " BaoPhuc - DVD - " + itemOrdered[i].getTitle() + 
                                " - " + itemOrdered[i].getCategory() + 
                                " - " + itemOrdered[i].getDirector() + 
                                " - " + itemOrdered[i].getLength() + 
                                " - " + itemOrdered[i].getCost() + "$");
                                
        }
        System.out.println("BaoPhuc - Total Cost: " + totalCost());
    }
    //phương thức tìm kiếm DVD theo id 
    public void searchDVD(int id){
        int found = 0;
        for (int i =0; i<qtyOrdered; i++){
            if (this.itemOrdered[i].getId() == id){
                found = i+1;
            }
        }
        if (found == 0){
            System.out.println("BaoPhuc - DVD not found!");
        } else {
            System.out.println("BaoPhuc - DVD founded has the title: " + itemOrdered[found-1].getTitle());
        }
    }
    //phương thức tìm kiếm DVD theo title
    public void searchDVD(String title){
        int found  = 0;
        for (int i=0; i<qtyOrdered; i++){
            if (itemOrdered[i].isMatch(title)){
                found = i+1;
                break;
            }
        }
        if (found == 0){
            System.out.println("BaoPhuc - DVD not found!");
        } else {
            System.out.println("BaoPhuc - DVD founded has the id: " + itemOrdered[found-1].getId());
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
