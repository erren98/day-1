
public class Developer extends Employee {
	public Developer(String name) {
		setName(name);
	}

	public void assign(Bug b1,Tester tester1) {
		System.out.println("Bug with id " + b1.getId() + " is assigned to " + tester1 );
	}
	
	
	public void editBugSeverity(Bug b1, SEVERITY severity) {
		b1.setSeverity(severity);
		System.out.println("Bug id is " + b1.getId() + " and Bug Severity is changed to " + b1.getSeverity());

	}
	
	@Override
	public String toString() {
		return getName();
	}
}
