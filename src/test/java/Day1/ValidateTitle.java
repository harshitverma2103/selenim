package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String act_title = driver.getTitle();
		String exp_title = "Your Store";
		Assert.assertEquals(act_title, exp_title, "Page title does not match!");
		driver.quit();
	}
}
