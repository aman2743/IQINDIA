package ActionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions act=new Actions(driver);
		WebElement fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
		act.moveToElement(fashion).build().perform();
		WebElement womenethnic=driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
		Thread.sleep(1000);
		act.moveToElement(womenethnic).build().perform();
		Thread.sleep(1000);
		WebElement ethnicdresses=driver.findElement(By.xpath("//a[text()='Ethnic Dresses']"));
		act.click(ethnicdresses).build().perform();
		
		
		
		
		

	}

}
