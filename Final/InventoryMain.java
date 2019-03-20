
public class InventoryMain {
	
public static void main(String[] args) {
        Inventory[] e = { new Book(),   new Magazine(), 
                         new DVD(), new CD() };

        for (int i = 0; i < e.length; i++) {
        	
        	e[i].itemnumber();
            e[i].itemtitle();
//            e[i].reserve();
            e[i].checkIn();
            e[i].checkOut();
//            e[i].payFines();
            System.out.println();
        }
    }
}




