

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Product p1 = new Product(02, "plates", 15, 100);
       Product p2 = new Product(07, "knives", 17, 80);
       
       System.out.println("Procduct 1 code is " + p1.getCode());
       System.out.println("Product 1 description: " + p1.getDescription());
       System.out.println("Product 1 price is $" + p1.getPrice());
       System.out.println("Product 1 counts as " + p1.getProductcount() + " units.");
       System.out.println("Product 1's cost is  $" + p1.purchase());
       
       System.out.println();
       
       System.out.println("Procduct 2 code is " + p2.getCode());
       System.out.println("Product 2 description: " + p2.getDescription());
       System.out.println("Product 2 price is $" + p2.getPrice());
       System.out.println("Product 2 counts as " + p2.getProductcount() + " units.");
       System.out.println("Product 2's cost is  $" + p2.purchase());
	
       
       System.out.println();
       
       System.out.println("Total cost is  $" + (p1.purchase() + p2.purchase()));
       System.out.println("Total unit amount is " + (p1.getProductcount() + p2.getProductcount()));
		}
 
    
}
