
public class ExceptionPropagation {
	public static void main(String[] args) {
		new A().m1();

	}
}

class A {
	void m1() {
		try {
			m2();
		} catch (RuntimeException runtimeException) {
			runtimeException.printStackTrace();
		} catch (Exception exception) {
			System.out.println("handled");

		} finally {
			System.out.println("Always Executed");
		}
		System.out.println("m1");
	}

	void m2() throws Exception {
		System.out.println("m2");
		//	throw new Exception();
		// throw new RuntimeException();
	}
}
