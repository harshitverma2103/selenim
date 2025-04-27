package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
     public static void main(String args[]) {
          ChromeDriver driver = new ChromeDriver();
          driver.get("https://demo.nopcommerce.com/");
          driver.manage().window().maximize();

          // tag id
          // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Phones");
          driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Phones");

          driver.quit();
     }
}
