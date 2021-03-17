
public class Tester extends Employee{
	private static String bugId;
//	private String name;
//	private int id;
//	private String email;
	
	//BUGSTATUS bugstatus = BUGSTATUS.OPEN;
	
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getTesterId() {
//		return id;
//	}
//	public void setTesterId(int testerId) {
//		this.id = testerId;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	//Actions to be taken by tester
	public void  action(Bug bug,BUGSTATUS bugstatus) {
		bugId = bug.getBugID();
		if( bugstatus == BUGSTATUS.NEED_MORE_INFO ) {
			System.out.println("Tester do some actions");
		}
		else if(bugstatus == BUGSTATUS.FIXED) {
			System.out.println("Status of bug with bug id "+ ""+ bugId + " is " + BUGSTATUS.FIXED);
		}
	}
	

}
