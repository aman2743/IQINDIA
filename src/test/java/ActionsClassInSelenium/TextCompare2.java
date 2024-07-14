package ActionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextCompare2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement input1=driver.findElement(By.id("inputText1"));
		WebElement input2=driver.findElement(By.id("inputText2"));
		input1.sendKeys("This is automation testing");
//		ctrl+A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
//		ctrl+C
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();		
		
//		Change focus
		act.sendKeys(Keys.TAB).build().perform();
		
//		ctrl+V
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();		
		
		String txt1=input1.getText();
		String txt2=input2.getText();
		
		if(txt1.equals(txt2)) {
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test case is failed");
		}
		
	}

}
