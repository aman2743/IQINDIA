package seleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertInSelenium2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		WebElement output=driver.findElement(By.xpath("//div[@id='output']"));
        String str=output.getText();
        System.out.println(str);

	}
}
