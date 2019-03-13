
public class AdvancedTicket extends Ticket {

	private int daysInAdvance;
	
	public AdvancedTicket(int number, int daysInAdvance) {
		super(number);
		this.daysInAdvance = daysInAdvance;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		if (daysInAdvance >= 10)
			return 30.0;
		else
		return 40;
	}
	
}
