
public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Ticket t = new Ticket(100);
		
		WalkupTicket wt1 = new WalkupTicket(101);
		
		System.out.println(wt1.getPrice());
		
		System.out.println(wt1.toString());
		
		Ticket[] t = {new WalkupTicket(102), new AdvancedTicket(103,15), new AdvancedTicket(104,7),
		        new WalkupTicket(105), new AdvancedTicket(106, 42)};
		//start a test
		for(int i = 0; i < t.length; i++) {
			
//			System.out.println();
			System.out.println(t[i].getClass() + "" + t[i].toString());
			
		}
	}

}
