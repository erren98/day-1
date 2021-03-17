import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestMath {

	@Test
	void testAdd() {
		Math math = new Math();
		int result = math.add(1,2,3);
		Assert.assertEquals(6, result);
		
	}

}
