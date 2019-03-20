// A class to represent CDs.
public class CD extends Inventory {
	
	private int latedays;
	
	public CD(int number, int latedays) {
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
		System.out.println("4010");
	}

	public void itemtitle() {
		System.out.println("Good Kid, M.A.A.D City");
	}
	
	public void checkIn() {
		System.out.println("From: Feb 22th 2019");
		
	}
	
	public void checkOut() {
		System.out.println("To: Mar 22th 2019");
	}
    
	public void explicit() {
		System.out.println("Dirty language in the content");
	}
	
	public String payFines() {
		return "This amount of fine needs to be paid: " + this.getFine();
	}
}

