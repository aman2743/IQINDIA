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

public class TakesScreenShot3 {
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		String path = "C:\\Users\\Aman\\eclipse-workspace\\GTC001\\Screenshot\\image2.png";
		FileOutputStream fos = new FileOutputStream(path);
		String base64code = ts.getScreenshotAs(OutputType.BASE64);
		byte[] bytearr = Base64.getDecoder().decode(base64code);
		fos.write(bytearr);	

	}

}