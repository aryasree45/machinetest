package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver driver;
public HomePage(WebDriver driver)
{
	this.driver=driver;
}
public String  navigateHome()
{
	System.out.println("page title :"+driver.getTitle());
	
	WebElement searchbox=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
	String act_dat=searchbox.getText();
	return act_dat;
}
public String cart()
{
	WebElement cartt=driver.findElement(By.xpath("//span[text()='Cart']"));
	String dat1=cartt.getText();
	return dat1;
}
public String viewsign()
{
	WebElement sign=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	String signin=sign.getText();
	return signin;
			
}

}
