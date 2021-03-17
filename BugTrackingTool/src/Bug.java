

public class Bug {
	// Bug status object
	// Default
	//BUGSTATUS bugStatus;
	//SEVERITY severity;

	private String Id;

	private String description;
	private String title;
	private String projectID;
	//private String bug_projectpriority;
	private String developerID;
	private String testerID;
	//private Date bug_due_date = new Date();

	// Add a bug
//	public void addBug(String ID,String title, String description, SEVERITY severity, BUGSTATUS bugstatus,
//			String testerID, String developerID, String projectID) {
//		//this.bugStatus = bugStatus;
////		this.severity = severity;
////		//this.bugStatus = bs;
////		this.description = description;
////		this.title = title;
////		this.projectID = projectID;
//////		this.bug_priority = bug_priority;
////		this.developerID = developerID;
////		this.testerID = testerID;
//		System.out.println(ID + " Bug  added... " + "with status " + bugstatus + " and Severity as " + severity);
//		
//	}

//	// edit a bugstatus
//	public void editBugStatus(String Id, BUGSTATUS bugStatus,SEVERITY severity) {
//		//bugStatus = BUGSTATUS.VERIFIED;
//		System.out.println("Bug Status changed to " + bugStatus + " and Bug Severity is changed to " + severity);
//
//	}

//	// close a bug
//	public void closeBug(String ID) {
//		bugStatus = BUGSTATUS.CLOSED;
//		System.out.println("Bug with id " + ID + " is closed and has a status " + bugStatus);
//	}
	
	//show the bug
	//public void showBug(i)

	// Getters and Setters
	public String getId() {
		return Id;
	}
	
	public void setId(String id) {
		Id = id;
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String bug_description) {
		this.description = bug_description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String bug_title) {
		this.title = bug_title;
	}

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String bug_projectID) {
		this.projectID = bug_projectID;
	}
//
//	public String getBug_priority() {
//		return bug_priority;
//	}
//
//	public void setBug_priority(String bug_priority) {
//		this.bug_priority = bug_priority;
//	}

	public String getDeveloperID() {
		return developerID;
	}

	public void setDeveloperID(String bug_developerID) {
		this.developerID = bug_developerID;
	}

	public String getTesterID() {
		return testerID;
	}

	public void setTesterID(String bug_testerID) {
		this.testerID = bug_testerID;
	}
	
	@Override
	public String toString() {
		return "Name of the bug is" + this.getTitle();
	}

	
	
	

}
