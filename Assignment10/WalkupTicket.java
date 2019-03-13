
public class WalkupTicket extends Ticket{
	
//	private double price;
    private String ticketType;
	public WalkupTicket(int number) {
		//invoke the constructor of the super class
		super(number);
		ticketType = "Walkup";
	}
	@Override
	public double getPrice() {
		
		return 50.00;
	}
//	@Override
//	public String toString() {
//		return "Number: " + number + ", Price: " + this.getPrice();
//	}
}
