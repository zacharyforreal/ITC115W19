import java.text.NumberFormat;

public class Product {
    
	//fields
	private int code;
	private String description;
	private double price;
	private int productcount;
	
	//constructor
	//precondition: code != null
	public Product(String description) {
		if(description == null) {
			throw new NullPointerException();
		}
		code = 0;
		price = 0.0;
		productcount = 0;
	}
	
	//methods
	
	public Product(int code, String description, double price, int productcount) {
		if (price < 0.0 || productcount < 0) {
			throw new IllegalArgumentException();
		}
		
		this.code = code;
		this.price = price;
		this.productcount = productcount;
	}
	
	public double purchase() {
		return ( price * productcount);
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setProductcount(int productcount) {
		this.productcount = productcount;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getProductcount() {
		return productcount;
	}
	
	public String getPriceFormatted() 
    {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }

	public String toString() {
		return "(" + code + "," + description + "," + price + "," + productcount + ")";
	}
	
}
