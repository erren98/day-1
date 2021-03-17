
public interface IBug {
	// add a bug
	void addBug(String ID, String title, String description, SEVERITY severity, BUGSTATUS bugstatus, String testerID,
			String developerID, String projectID);

	// edit a bugstatus
	public void editBugStatus(String Id, BUGSTATUS bugStatus, SEVERITY severity);

	// close a bug
	public void closeBug(String ID);
			
}
