//represents magazines
public class Magazine extends Inventory{
	private int latedays;
	
	public Magazine(int number, int latedays) {
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
		System.out.println("2129");
	}

	public void itemtitle() {
		System.out.println("Discovery Vol.336");
	}
	
	public void reserve() {
		System.out.println("It is reserved unitl end of this week.");
		
	}
	
	public void checkIn() {
		System.out.println("From: Jan 9th 2019");
		
	}
	
	public void checkOut() {
		System.out.println("To: Jan 19th 2019");
	}

	
	
}



