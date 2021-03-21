
public class Tester extends Employee{
	Manager manager;
	
	public Tester(){};
	
	public Tester(String name){
		setName(name); 
	}
	

	
	//Actions to be taken by tester
//TODO: TO BE COMPLETED
	public void  action(Bug bug,BUGSTATUS bugstatus) {
		
		if( bugstatus == BUGSTATUS.NEED_MORE_INFO ) {
			System.out.println("Tester do some actions");
		}
		else if(bugstatus == BUGSTATUS.FIXED) {
			System.out.println("Status of bug with bug id "+ ""+ getId() + " is " + BUGSTATUS.FIXED);
		}
	}
	
	public void addBug(Bug b1) {
		System.out.println(b1.getId() + " Bug  added... " + "with status " + b1.getBugstatus()+ " and Severity as " + b1.getSeverity());
	}
	
	public void editBugStatus(Bug b1, BUGSTATUS bugStatus, SEVERITY severity) {
		b1.setBugstatus(bugStatus);
		b1.setSeverity(severity);
		System.out.println(b1.getId()+ " " +"Bug Status changed to " + b1.getBugstatus() + " and Bug Severity is changed to " + b1.getSeverity());

	}

	public void showReport(Bug bug1) {
		System.out.println("Bug Name: " + bug1.getTitle() + " Bug description: " + bug1.getDescription() + "Bug Status :" + bug1.getBugstatus());
	}
	
	public void closeBug(Bug bug1) {
		bug1.setBugstatus(BUGSTATUS.CLOSED);
		System.out.println("Bug with id " + bug1.getId() + " is closed and has a status " + bug1.getBugstatus());
	}
	
	public void mail(Manager manager) {
		String managerEmail = manager.getEmail();
		System.out.println("Mailing the bug report to " + manager.getName() + " with email id : " + manager.getEmail());
	}
	
	@Override
	public String toString() {
		return getName();
	}
	

}
