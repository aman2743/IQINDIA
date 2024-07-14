package WaitsInSelenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class StaticWaitInSelenium2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	    driver.findElement(By.id("btn1")).click();
	    WebElement we=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
	    we.sendKeys("new custom text");
	    driver.findElement(By.id("btn2")).click();
	    WebElement we1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
	    we1.sendKeys("new custom text inside second field");

 }
}