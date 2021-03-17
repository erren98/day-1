
public class Developer extends Employee {
	private int bugId;
	
	public void addBug(Bug b1) {
		System.out.println(b1.getId() + " Bug  added... " + "with status " + b1.getBugstatus()+ " and Severity as " + b1.getSeverity());
	}
}
