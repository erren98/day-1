

public class Bug {
	// Bug status object
	// Default
	BUGSTATUS bugStatus = BUGSTATUS.OPEN;

	private static String bugID;
	private String bug_description;
	private String bug_title;
	private String bug_projectID;
	private String bug_priority;
//	public enum bug_status {
//		OPEN, RESOLVED, CLOSED
//	}
	private String bug_developerID;
	private String bug_testerID;
	//private Date bug_due_date = new Date();

	// Add a bug
	public void addBug(String bugId,String bug_title, String bug_description, String bug_priority, BUGSTATUS bs,
			String bug_testerID, String bug_developerID, String bug_projectID) {
		bs = BUGSTATUS.OPEN;
		this.bugID = bugId;
		this.bugStatus = bs;
		this.bug_description = bug_description;
		this.bug_title = bug_title;
		this.bug_projectID = bug_projectID;
		this.bug_priority = bug_priority;
		this.bug_developerID = bug_developerID;
		this.bug_testerID = bug_testerID;
		System.out.println(getBugID() + " Bug  added... " + "with status " + bs);
		
	}

	// edit a bugstatus
	public void editBugStatus(String bugID, BUGSTATUS bugStatus) {
		//bugStatus = BUGSTATUS.VERIFIED;
		System.out.println("Bug Status changed to " + bugStatus);
	}

	// close a bug
	public void closeBug(String bugID) {
		bugStatus = BUGSTATUS.CLOSED;
		System.out.println("Bug with id " + getBugID() + " is closed and has a status " + bugStatus);
	}
	
	//show the bug
	//public void showBug(i)

	// Getters and Setters
	public String getBugID() {
		return bugID;
	}

	public void setBugID(String bugID) {
		this.bugID = bugID;
	}

	public String getBug_description() {
		return bug_description;
	}

	public void setBug_description(String bug_description) {
		this.bug_description = bug_description;
	}

	public String getBug_title() {
		return bug_title;
	}

	public void setBug_title(String bug_title) {
		this.bug_title = bug_title;
	}

	public String getBug_projectID() {
		return bug_projectID;
	}

	public void setBug_projectID(String bug_projectID) {
		this.bug_projectID = bug_projectID;
	}

	public String getBug_priority() {
		return bug_priority;
	}

	public void setBug_priority(String bug_priority) {
		this.bug_priority = bug_priority;
	}

	public String getBug_developerID() {
		return bug_developerID;
	}

	public void setBug_developerID(String bug_developerID) {
		this.bug_developerID = bug_developerID;
	}

	public String getBug_testerID() {
		return bug_testerID;
	}

	public void setBug_testerID(String bug_testerID) {
		this.bug_testerID = bug_testerID;
	}
	
	@Override
	public String toString() {
		return "Name of the bug is" + getBug_title();
	}

	
	
	

}
