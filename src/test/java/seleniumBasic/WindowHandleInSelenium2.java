package seleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleInSelenium2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		String pwindow=driver.getWindowHandle();
		System.out.println(pwindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at Parent Page");
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> cwindow=driver.getWindowHandles();
		for(String str:cwindow) {
			if(!str.equals(pwindow)) {
				driver.switchTo().window(str);
				Thread.sleep(2000);
				String title=driver.getTitle();
				System.out.println(title);
				Thread.sleep(3000);
				driver.close();
			}	
		}
	    driver.switchTo().window(pwindow);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='name']")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at Parent Page after child window");
	    driver.quit();
	}
}
