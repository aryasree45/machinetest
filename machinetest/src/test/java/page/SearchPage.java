package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	WebDriver driver;
	public SearchPage (WebDriver driver)
	{
		this.driver=driver;
	}
	public void searchbox(String prod)
	{
		WebElement box=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		box.sendKeys(prod);
	}
	public void searchbtn()
	{
		WebElement btn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btn.click();
	}
	public String Results()
	{
		WebElement result=driver.findElement(By.xpath("//h2[text()='Results']"));
		String resultext=result.getText();
		return  resultext;
		
	}
}
