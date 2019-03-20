// A class to represent CDs.
public class CD extends DVD {
	
	private String explicit;
	
        public CD() {
		
		super();
		
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
}

