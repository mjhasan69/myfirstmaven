package march22;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProduct {

	@Test
	public void searchProduct(){
		System.out.println("This test is for SearchProduct");
		
	}
	
	@Test
	public void searchSpecificProduct(){
		Assert.fail("Some Reason");
		System.out.println("This test is for SearchSpecificProduct");
		
	}

}
