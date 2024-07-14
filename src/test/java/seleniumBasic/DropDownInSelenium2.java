package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownInSelenium2 {
	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
     Thread.sleep(2000);
     WebElement we=driver.findElement(By.id("ide"));
     Select sl=new Select(we);
     sl.selectByIndex(1);
     Thread.sleep(2000);
     sl.selectByIndex(2);
     Thread.sleep(2000);
     sl.selectByIndex(3);
     Thread.sleep(2000);
     sl.deselectAll();

	}
}
