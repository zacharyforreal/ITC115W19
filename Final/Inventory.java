//represent employees in general
public abstract class Inventory {
	
	private int number;
	public Inventory(int number) {
		this.number = number;
	}
	
	public abstract double getFine();
	
	@Override
	public String toString() {
		return "This amount of fine needs to be paid: " + this.getFine();
	}
	
	public void itemnumber() {
		System.out.println("0001");
	}
	
	public void itemtitle() {
		System.out.println("A song of ice and fire");
		
	}
	
	public void reserve() {
		System.out.println("It will be borrowed tomorrow");
	}
	
	public void checkIn() {
		System.out.println("From: Jan 1st 2019");
	}
	
	public void checkOut() {
		System.out.println("To: Jan 15th 2019");
	}
	
	public String payFines() {
		System.out.println("Fines need to be charged to the borrower");
		return null;
	}
	
}

