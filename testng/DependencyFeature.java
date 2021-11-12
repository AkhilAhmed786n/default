package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyFeature {
	@Test(priority = 2)
	public void register1() {
		Reporter.log("Registered successfully",true);
	}
	@Test(priority = 3)
	public void register2() {
		Reporter.log("Registered successfully",true);
	}
	@Test(priority = 2)
	public void register3() {
		Reporter.log("Registered successfully",true);
	}
	@Test(priority = 3, enabled = false)
	public void register4() {
		Reporter.log("Shakeel",true);
	}
	@Test(priority = 1,invocationCount = 10)
	public void register5() {
		Reporter.log("Aakhil",true);
	}
	@Test(priority = 2)
	public void register6() {
		Reporter.log("Smeer",true);
	}
	@Test(priority = 4)
	public void register7() {
		Reporter.log("Ishtiyaq",true);
	}
	@Test(priority = 5)
	public void register8() {
		Reporter.log("Tameem",true);
	}
	@Test(priority =8 )
	public void register9() {
		Reporter.log("Tanveer",true);
	}
	@Test(priority = 3)
	public void register10() {
		Reporter.log("Junaid",true);
	}
	@Test(priority = 6)
	public void register11() {
		Reporter.log("Inam",true);
	}
	@Test(priority = 7)
	public void register12() {
		Reporter.log("Ikram",true);
	}
	@Test(priority = 9, dependsOnMethods = {"register5","register6"})
	public void delete() {
		Reporter.log("Deleted successfully",true);
	}
}
