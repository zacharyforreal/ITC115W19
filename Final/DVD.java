//represent DVDs
public class DVD extends Inventory {
	private int latedays;
	
	public DVD(int number, int latedays) {
		super(number);
		this.latedays = latedays;
	}
	
	@Override
	public double getFine() {
		if (latedays > 0)
			return 5.0;
		else
			return 0;
	}
	public void itemnumber() {
		System.out.println("3008");
	}

	public void itemtitle() {
		System.out.println("No Country for Old Men");
	}
	
	public void checkIn() {
		System.out.println("From: Feb 4th 2019");
		
	}
	
	public void checkOut() {
		System.out.println("To: Feb 14th 2019");
	}
	
	public void premium() {
		System.out.println("It is in the 'Western World' Premium Collection Series");
	}
	
	public String payFines() {
		return "This amount of fine needs to be paid: " + this.getFine();
	}
}

