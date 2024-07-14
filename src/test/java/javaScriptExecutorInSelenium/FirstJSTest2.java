package javaScriptExecutorInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstJSTest2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("http://altoro.testfire.net/bank/main.jsp");
		Thread.sleep(1000);
		WebElement uname=driver.findElement(By.id("uid"));
		WebElement pass=driver.findElement(By.name("passw"));
		WebElement login=driver.findElement(By.name("btnSubmit"));
		js.executeScript("arguments[0].value='jsmith'", uname);
		js.executeScript("arguments[0].value='demo1234'", pass);
		js.executeScript("arguments[0].click()", login);
		
	}

}
