
public class Employee implements IBug {

	//BUGSTATUS bugstatus;
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

	public void action(Bug bug, BUGSTATUS needMoreInfo) {
		System.out.println("Action Required !!");

	}

	@Override
	public void addBug(String ID, String title, String description, SEVERITY severity, BUGSTATUS bugstatus,
			String testerID, String developerID, String projectID) {
		System.out.println(ID + " Bug  added... " + "with status " + bugstatus + " and Severity as " + severity);
	}

	@Override
	public void editBugStatus(String Id, BUGSTATUS bugStatus, SEVERITY severity) {
		System.out.println("Bug Status changed to " + bugStatus + " and Bug Severity is changed to " + severity);

	}

	// close a bug
	public void closeBug(String ID) {
		System.out.println("Bug with id " + ID + " is closed and has a status " + BUGSTATUS.CLOSED);
	}

}
