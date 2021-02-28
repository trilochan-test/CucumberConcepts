package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	@Before("@Regression")
	public void setUp(Scenario sc) {
		System.out.println("Launch Amazon Application");
		System.out.println("Scenario Name : " + sc.getName());
		//int a=20/0;
	}

	@After("@Regression")
	public void tearDown(Scenario sc) {
		System.out.println("Close the Browser");
		System.out.println("Scenario Name : " + sc.getName());
	}

	/*
	 * @Before(order = 2) public void setUpDB() {
	 * System.out.println("Connection Established"); }
	 * 
	 * @After(order = 2) public void tearDownDB() {
	 * System.out.println("Close the Connection"); }
	 * 
	 * @BeforeStep public void takeScreenShot() {
	 * System.out.println("Take a Screen Shoot"); }
	 * 
	 * @AfterStep public void refreshPage() { System.out.println("Refresh Page"); }
	 */
}
