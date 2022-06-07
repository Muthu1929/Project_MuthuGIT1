package org.dataproviderr;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassA {

	@Parameters	({"username"})
	
	@Test
	public void testA1 (String u) {
		System.out.println("testA1");
	
	}
	@Parameters	({"useername","password" })

	@Test
	public void testA2 (@Optional("scope28@gmail.com")String u, String p) {
		System.out.println("testA2");
		
	}
	
	@Test
	public void testA3 () {
		System.out.println("testA3");
	
}
	
}
