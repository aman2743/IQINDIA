package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathHYRTutorial2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[contains(text(),'into account')]")).click();
//		driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into')]")).click();
		driver.findElement(By.xpath("(//div[@class='container']/child::input[@type='text'])[1]")).sendKeys("test001");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("Test@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='container']/descendant::button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[text()='Mexico']/preceding-sibling::td[2]/child::input")).click();
		Thread.sleep(1000);
	}
}