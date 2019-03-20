//represents books
public class Book  extends Inventory{

	private int latedays;
	
	public Book(int number, int latedays) {
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
		System.out.println("0013");
	}

	public void itemtitle() {
		System.out.println("The Red and the Black");
	}
	
	public void origintitle() {
		System.out.println("Origin Title: 'Le Rouge et le Noir'");
	}
	
	public void checkIn() {
		System.out.println("From: Jan 4th 2019");
	}
	
	public void checkOut() {
		System.out.println("To: Jan 24th 2019");
	}
	
}


