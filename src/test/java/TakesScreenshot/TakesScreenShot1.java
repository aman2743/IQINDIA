package TakesScreenshot;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenShot1 {
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		driver.get("https://www.google.co.in");
		String path = "C:\\Users\\Aman\\eclipse-workspace\\GTC001\\Screenshot\\image3.png";
		FileOutputStream fos = new FileOutputStream(path);
		byte[] bytearr = ts.getScreenshotAs(OutputType.BYTES);
		fos.write(bytearr);	

	}

}