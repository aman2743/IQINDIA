package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class StaticWaitInSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	    driver.findElement(By.id("btn1")).click();
	    driver.findElement(By.id("txt1")).sendKeys("custom text");
	    driver.findElement(By.id("btn2")).click();
	    driver.findElement(By.id("txt2")).sendKeys("this is new text");
//	    driver.quit();
 }
}