package a1;

import org.junit.Test;

import a1.TrainCompany;

public class TrainCompanyTest {

	// An example of how to verify that an exception is thrown
	@Test(expected=IllegalArgumentException.class)
	public void cannotCreateCompanyWithNullName() {
		new TrainCompany(null);
	}
	
}
