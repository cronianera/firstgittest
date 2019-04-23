package GITTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GITTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src , new File("C:\\Users\\Renuka\\eclipse-workspace\\027GITTest\\Screenshot\\image.jpg"));
	}

}
