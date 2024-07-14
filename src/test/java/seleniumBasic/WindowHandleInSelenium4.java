package seleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleInSelenium4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		driver.manage().window().maximize();
		String bc="";
		String cm="";
		String xp="";
		String ad="";
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		String pwindow = driver.getWindowHandle();
		System.out.println(pwindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at Parent Page");
		options.addArguments("--disable-notifications");
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Set<String> cwindow = driver.getWindowHandles();
		for (String wid : cwindow) {
			if (!wid.equals(pwindow)) {
				driver.switchTo().window(wid);
				Thread.sleep(3000);
				String title = driver.getTitle();

				if (title.contains("Basic Controls")) {
					bc = wid;
					System.out.println(bc);
				} else if (title.contains("Contact Me")) {
					cm = wid;
					System.out.println(cm);
				} else if (title.contains("XPath Practice")) {
					xp = wid;
					System.out.println(xp);
				} else if (title.contains("AlertsDemo")) {
					ad = wid;
					System.out.println(ad);
				}
			}
		}
//		working on Basic Control
			driver.switchTo().window(bc);
			Thread.sleep(2000);
			String str1=driver.getCurrentUrl();
			System.out.println(str1);
			driver.close();

//			working on Contact Me
			driver.switchTo().window(cm);
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			driver.close();

//		   working on XPath Practice
			driver.switchTo().window(xp);
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			driver.close();

//		  working on AlertsDemo
			driver.switchTo().window(ad);
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			driver.close();
			
//			Working on parent window
			driver.switchTo().window(pwindow);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='name']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at Parent Page after child window");
			driver.quit();
		}
	}