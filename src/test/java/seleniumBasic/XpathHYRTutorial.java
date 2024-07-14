package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathHYRTutorial {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		int sum=0;
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(1000);
//		WebElement amount=driver.findElement(By.xpath("(//td[text()='5000'])[1]"));
//	    String str=amount.getText();
//	    System.out.println(str);
		List<WebElement> lst=driver.findElements(By.xpath("//td[text()<='5000']"));
		for(WebElement we:lst) {
			String str=we.getText();
			int l=Integer.parseInt(str);
			System.out.println("value="+l);
			sum=l+sum;
		}
       System.out.println(sum);
	}

}
