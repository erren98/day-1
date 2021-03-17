
public interface IBug {
	// add a bug
	//void addBug(Bug b1);
	
//	void addBug(Bug b1,String ID, String title, String description, SEVERITY severity, BUGSTATUS bugstatus, String testerID,
//			String developerID, String projectID);

	// edit a bugstatus
	//public void editBugStatus(String Id, BUGSTATUS bugStatus, SEVERITY severity);
	
	public void editBugStatus(Bug b1, BUGSTATUS bugStatus, SEVERITY severity);

	// close a bug
	public void closeBug(Bug b1);
	
	//show the bug
	public void showBug(Bug b1);
			
}
