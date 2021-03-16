
public class Application {
	
	public static void main(String[] args) {
		Bug bug = new Bug();
		Tester tester = new Tester();
		Developer developer = new Developer();
		
		tester.addBug("1","First Bug", "Initial Bug","Urgent", BUGSTATUS.OPEN, "1", "1", "1");
		developer.editBugStatus("1", BUGSTATUS.VERIFIED);
		Tester.action(bug, BUGSTATUS.NEED_MORE_INFO);
		tester.closeBug("1");

	}

}
