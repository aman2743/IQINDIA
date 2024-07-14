package javaScriptExecutorInSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstJSTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("http://altoro.testfire.net/bank/main.jsp");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('uid').value='jsmith'");
		js.executeScript("document.getElementsByName('passw')[0].value='demo1234'");
		js.executeScript("document.getElementsByTagName('input')[4].click()");
		
	}

}
