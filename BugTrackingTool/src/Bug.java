
public class Bug {

	BUGSTATUS bugstatus;
	SEVERITY severity;

	private String Id;
	private String description;
	private String title;
	private String projectID;
	private String developerID;
	private String testerID;
	
	public Bug() {
	}

	// Getters and Setters
	public SEVERITY getSeverity() {
		return severity;
	}

	public void setSeverity(SEVERITY severity) {
		this.severity = severity;
	}

	public BUGSTATUS getBugstatus() {
		return bugstatus;
	}

	public void setBugstatus(BUGSTATUS bugstatus) {
		this.bugstatus = bugstatus;
	}

	public String getDeveloperID() {
		return developerID;
	}

	public void setDeveloperID(String developerID) {
		this.developerID = developerID;
	}

	public String getTesterID() {
		return testerID;
	}

	public void setTesterID(String testerID) {
		this.testerID = testerID;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	@Override
	public String toString() {
		return "Name of the bug is " + this.getTitle();
	}

	public Bug(BUGSTATUS bugstatus, SEVERITY severity, String id, String description, String title, String projectID,
			String developerID, String testerID) {
		super();
		this.bugstatus = bugstatus;
		this.severity = severity;
		Id = id;
		this.description = description;
		this.title = title;
		this.projectID = projectID;
		this.developerID = developerID;
		this.testerID = testerID;
	}

}
