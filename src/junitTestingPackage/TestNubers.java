package junitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNubers {

	@Test
	void test() {
		Function obj1=new Function();
		int res=obj1.addNumbers(100,200);
		assertEquals(res,300);
	}

}
