package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownInSelenium3 {
	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
     Thread.sleep(2000);
     WebElement dropDown=driver.findElement(By.id("course"));
     Select sl=new Select(dropDown);
     List<WebElement> lst=sl.getOptions();
     System.out.println(lst.size());
     for(WebElement we:lst) {
    	 String str=we.getText();
    	 System.out.println(str);
    	 sl.selectByVisibleText(str);
    	 Thread.sleep(2000);
     }  
	}
}
