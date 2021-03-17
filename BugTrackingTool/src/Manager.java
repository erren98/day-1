
public class Manager extends Employee {
	
	public void assign(Bug b1,Tester tester1) {
		System.out.println("Bug with id " + b1.getId() + " is assigned to " + tester1 );
	}

}
