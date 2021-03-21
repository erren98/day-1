import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestMath {
	Math math;
	//Executed before any test cases is called
	//Reduce the redundant code
	@BeforeEach
	void init() {
		//System.out.println("init");
		math = new Math();
	}
	
	//Test method
	@Test
	void testAdd() {
		
		int result = math.add(1,2,3);
		assertEquals(6, result);

	}
	
	@Test
	void testAddWithNegativeNumbers() {
		
		int result = math.add(-1,-2,-3);
		assertEquals(-6, result);

	}
	
	@Test
	void testMultiply() {
		
		int result = math.multiply(3,2,3);
		assertEquals(18, result);
	}
	
	@Test
	void testMultiplyByOneZero() {
		
		int result = math.multiply(0,2,3);
		assertEquals(0, result);
		
	}
	
//	@Test()
	//Corner Cases
//	void testMultiplyByOneNegative() {
//		//Exception handling in JUnit 5
//		Exception exception = assertThrows(IllegalArgumentException.class,()->{
//			
//			int result = math.multiply(-1,2,3);
//		});
//		//No assertion required here
//		//Assert.assertEquals(-6, result);
//		
//	}
	
	
	

}
