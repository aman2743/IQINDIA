package ActionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeryboardOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
//		act.sendKeys(Keys.ALT).build().perform();
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		act.sendKeys(Keys.DOWN).build().perform();
	}

}
