
public class Manager extends Employee {
	BUGSTATUS bugstatus;
	
	public Manager(){};
	
	public Manager(String name,String email) {
		setEmail(email);
		setName(name);
	}
	
	
	
	public void approvalStatus(Bug bug1) {
		
		if(bug1.getBugstatus() == BUGSTATUS.CLOSED) {
			System.out.println("Bug is approved");
		}
	}
	
	@Override
	public String toString() {
		
		return getName();
	}
	

}
