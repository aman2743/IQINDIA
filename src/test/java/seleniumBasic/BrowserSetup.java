package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.id("email")).sendKeys("test1605@test.com");
	    driver.findElement(By.id("pass")).sendKeys("Test1234");
	    driver.findElement(By.id("send2")).click();

	}

}
