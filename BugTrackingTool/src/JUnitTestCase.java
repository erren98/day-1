import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class JUnitTestCase {
	Tester tester;
	Developer developer;
	Bug bug1;
	Manager manager;
	
	@BeforeEach
	void init() {
		 tester = new Tester("Ram");
		developer = new Developer("Shyam");
		bug1 = new Bug(BUGSTATUS.OPEN,SEVERITY.HIGH,"1","StackoverFlow error","first error","project1","developer1","tester1");
		manager = new Manager("Rohan", "rohan@gmail.com");
	}
	
	@Test
	void testAssignBug() {
		 developer.assign(bug1, tester);
		 Assert.assertEquals("Ram", tester.getName());
		 
	}
	
	@Test
	void actionByTester() {
		
		developer.editBugStatus(bug1, BUGSTATUS.NEED_MORE_INFO, SEVERITY.HIGH);
		tester.action(bug1, BUGSTATUS.NEED_MORE_INFO);
		Assert.assertEquals(BUGSTATUS.NEED_MORE_INFO, bug1.getBugstatus());
	}
	
	@Test
	void mailToManager() {
		tester.mail(manager);
		Assert.assertEquals("rohan@gmail.com", manager.getEmail());
		
	}
	
	

}
