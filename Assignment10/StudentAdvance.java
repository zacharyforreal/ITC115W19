
public class StudentAdvance {

	private int daysInAdvance;
	
	public StudentAdvance(int number, int daysInAdvance) {
		super();
		this.daysInAdvance = daysInAdvance;
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		if (daysInAdvance >= 10)
			return 15.0;
		else
		return 20;
	}
	
}
