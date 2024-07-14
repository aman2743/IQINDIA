package IframePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Input at main page");
	    driver.switchTo().frame("frm3");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Input inside frame3");
		driver.switchTo().frame("frm1");
		Thread.sleep(2000);
		WebElement we=driver.findElement(By.id("selectnav1"));
		Select sl=new Select(we);
		sl.selectByIndex(2);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Input inside frame3 after frame1");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Input at main page after child");
	}
}
