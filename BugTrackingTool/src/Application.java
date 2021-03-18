
public class Application {
	
	public static void main(String[] args) {
		
		
		Bug bug1 = new Bug(BUGSTATUS.OPEN,SEVERITY.HIGH,"1","StackoverFlow error","first error","project1","developer1","tester1");
		
		
		Tester tester = new Tester("Ram");
		Developer developer = new Developer("Shyam");
		Manager manager  = new Manager("Rohan");
		
		developer.assign(bug1, tester);
		tester.addBug(bug1);
		developer.editBugStatus(bug1, BUGSTATUS.FIXED, SEVERITY.HIGH);
		tester.editBugStatus(bug1, BUGSTATUS.VERIFIED, SEVERITY.LOW);
		tester.closeBug(bug1);
		tester.showReport(bug1);
		manager.approvalStatus(bug1);

	}

}
