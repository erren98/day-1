
public class Application {
	
	public static void main(String[] args) {
		Bug bug = new Bug();
		
		Employee tester = new Tester();
		Employee developer = new Developer();
		
		tester.addBug("2", "firstBug", "StackOverflow error", SEVERITY.HIGH, BUGSTATUS.OPEN, "tester1", "developer1", "project1");
		developer.editBugStatus("1", BUGSTATUS.VERIFIED, SEVERITY.MEDIUM);
		tester.action(bug, BUGSTATUS.NEED_MORE_INFO);
		developer.closeBug("1");

	}

}
