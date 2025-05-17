package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	Properties prop;
	public void loadprop() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\selenium workspace\\machinetest\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(fis);
	}
@BeforeTest
public void setConfig() throws IOException
{
	loadprop();
String browser=prop.getProperty("browser","chrome").toLowerCase();
	
	switch(browser)
	{
	case "chrome":WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					break;
	case "firefox":WebDriverManager.firefoxdriver().setup();
					driver=new ChromeDriver();
					break;
					default:throw new IllegalArgumentException("unsupported browser"+browser);
	}
	String url=prop.getProperty("url");
	if(url==null||url.isEmpty()) {
		throw new IllegalArgumentException("url is missing in config.properties");
	}
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
@AfterTest
public void closeDriver()
{
	if(driver!=null) {
		driver.quit();
	}
}
}
