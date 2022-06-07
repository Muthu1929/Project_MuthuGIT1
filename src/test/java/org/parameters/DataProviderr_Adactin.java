package org.parameters;
import org.testng.annotations.DataProvider;

public class DataProviderr_Adactin  {
	
	//@DataProvider(name="login",indices= {0,3}, parallel =true)

	@DataProvider(name="login")
	private  Object[][] DataProvider() {
		Object[][] obj = new Object[][] {
			{"Muthu","pavi2987"},
			{"Muthu63548736","ssbidhfi"},
			{"63548736","dvsvkv"},
			{"Muthu63548736","Muthu@123"}
		};
		return obj;
		
	}
	
	
}

	