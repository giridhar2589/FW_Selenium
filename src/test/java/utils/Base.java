package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver ;
	public Properties prop;

	public WebDriver initlaizedriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("F:\\Automation_learnings\\FWSelenium\\FW_Selenium\\src\\test\\java\\propertiesFiles\\AppUrl.properties");
		prop.load(fis);
		String browserName = prop.getProperty("BrowserName");
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Automation_learnings\\FWSelenium\\FW_Selenium\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			//execute in chrome driver

		}
		else if (browserName.equals("firefox"))
		{
			driver= new FirefoxDriver();
			//firefox code
		}
		else if (browserName.equals("IE"))
		{
			//		IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		return driver;
	}
}
