package ActionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHoldMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		WebElement source=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target=driver.findElement(By.xpath("//p[text()='Drop here']"));
//		act.dragAndDrop(source, target).release().build().perform();
//		act.dragAndDropBy(source,200,200).release().build().perform();
		act.clickAndHold(source).moveToElement(target).release().build().perform();
	}

}
