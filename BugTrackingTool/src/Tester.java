
public class Tester extends Bug{
	private String name;
	private int id;
	private String email;
	private static String bugId;
	//BUGSTATUS bugstatus = BUGSTATUS.OPEN;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTesterId() {
		return id;
	}
	public void setTesterId(int testerId) {
		this.id = testerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//Actions to be taken by tester
	public static void  action(Bug bug,BUGSTATUS bugstatus) {
		bugId = bug.getBugID();
		if( bugstatus == BUGSTATUS.NEED_MORE_INFO ) {
			System.out.println("Tester do some actions");
		}
		else if(bugstatus == BUGSTATUS.FIXED) {
			System.out.println("Status of bug with bug id "+ ""+ bugId + " is " + BUGSTATUS.FIXED);
		}
	}
	

}
