package junitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestString {

	@Test
	void test() {
		Function obj2=new Function();
		String res=obj2.addString("Happy ","Birthday");
		assertEquals(res,"Happy Birthday");
	}

}
