
public class InventoryMain {
	
public static void main(String[] args) {
        Inventory[] t = { new Book(0013,0),   new Magazine(2129,0), 
                         new DVD(3008,3), new CD(4010,2) };

        for (int i = 0; i < t.length; i++) {
        	
        	t[i].itemnumber();
            t[i].itemtitle();
//            e[i].reserve();
            t[i].checkIn();
            t[i].checkOut();
//            e[i].payFines();
            System.out.println();
        }
    }
}




