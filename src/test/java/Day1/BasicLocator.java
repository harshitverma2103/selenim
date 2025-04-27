package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {
	public static void main(String[] args) {
		// Initialize the ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Open the URL and maximize the browser window
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		// Enter text in the search box using name locator
		driver.findElement(By.name("search")).sendKeys("Mac");

		// Check visibility of the logo using ID locator
		WebElement logo = driver.findElement(By.id("logo"));
		if (logo.isDisplayed()) {
			System.out.println("Logo is visible.");
		} else {
			System.out.println("Logo is not visible.");
		}

		// LinkText
		// driver.findElement(By.linkText("Desktops")).click();

		// Click on "Desktops" using partial link text
		driver.findElement(By.partialLinkText("Desk")).click();
		driver.quit();
	}
}
