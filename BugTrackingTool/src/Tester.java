
public class Tester extends Employee{
	
	public Tester(String name){
		setName(name); 
	}
	
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
//TODO: TO BE COMPLETED
	public void  action(Bug bug,BUGSTATUS bugstatus) {
		
		if( bugstatus == BUGSTATUS.NEED_MORE_INFO ) {
			System.out.println("Tester do some actions");
		}
		else if(bugstatus == BUGSTATUS.FIXED) {
			System.out.println("Status of bug with bug id "+ ""+ getId() + " is " + BUGSTATUS.FIXED);
		}
	}
	
	@Override
	public String toString() {
		return getName();
	}
	

}
