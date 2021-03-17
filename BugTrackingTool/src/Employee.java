
public class Employee {
	public Employee(String name) {
		setName(name);
		
	}
	private String name;
	private String id;
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public void action(Bug bug, BUGSTATUS needMoreInfo) {
//		System.out.println("Action Required !!");
//
//	}

	
//	public void addBug(Bug b1,String ID, String title, String description, SEVERITY severity, BUGSTATUS bugstatus,
//			String testerID, String developerID, String projectID) {
////		b1.setId(ID);
////		b1.setTitle(title);
////		b1.setDescription(description);
////		b1.setSeverity(severity);
////		b1.setBugstatus(bugstatus);
////		b1.setTesterID(testerID);
////		b1.setDeveloperID(developerID);
////		b1.setProjectID(projectID);
//		System.out.println(b1.getId() + " Bug  added... " + "with status " + b1.getSeverity()+ " and Severity as " + severity);
//	}
	

//	@Override
//	public void editBugStatus(Bug b1, BUGSTATUS bugStatus, SEVERITY severity) {
//		b1.setBugstatus(bugStatus);
//		b1.setSeverity(severity);
//		System.out.println(b1.getId()+ " " +"Bug Status changed to " + b1.getBugstatus() + " and Bug Severity is changed to " + b1.getSeverity());
//
//	}
//	
//	
//	// close a bug
//	@Override
//	public void closeBug(Bug b1) {
//		b1.setBugstatus(BUGSTATUS.CLOSED);
//		System.out.println("Bug with id " + b1.getId() + " is closed and has a status " + b1.getBugstatus());
//	}
//	
	//show the bug
//	@Override
//	public void showBug(Bug b1) {
//		System.out.println(b1);
//	}
	
	
}
