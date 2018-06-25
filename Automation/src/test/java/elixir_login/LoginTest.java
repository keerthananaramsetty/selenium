package elixir_login;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	WebDriver driver;
  @Test
  public void loin_function() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\3\\Downloads\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://demo.elixiraid.com/index.php/core/financialyear/create");
	  driver.manage().window().maximize();
  }

}
