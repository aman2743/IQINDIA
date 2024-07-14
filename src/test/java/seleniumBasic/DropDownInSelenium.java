package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownInSelenium {
	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
     Thread.sleep(2000);
     WebElement we=driver.findElement(By.id("course"));
     Select sl=new Select(we);
//ByIndex
//     sl.selectByIndex(0);
//     Thread.sleep(3000);
//     sl.selectByIndex(1);
//     Thread.sleep(3000);
//     sl.selectByIndex(2);
//     Thread.sleep(3000);
// selectByVisibleText
//     sl.selectByVisibleText("Java");
//     Thread.sleep(3000);
//     sl.selectByVisibleText("Python");
//     Thread.sleep(3000);
     sl.selectByValue("net");
     Thread.sleep(3000);
     sl.selectByValue("js");
     Thread.sleep(3000);
	}
}
