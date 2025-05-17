package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductPage {
	WebDriver driver;
	public ProductPage (WebDriver driver)
	{
		this.driver=driver;
	}
public void selectHeadphn()
{
	WebElement phn=driver.findElement(By.xpath("//span[text()='boAt Rockerz 480 w/RGB LEDs, 6 Light Modes, 40mm Drivers, Beast Mode, 60hrs Playback, ENx Tech, BT v5.3, Adaptive Fit & Easy Access Controls, Bluetooth Headphones(Black Sabre)']"));
	phn.click();
	Assert.assertTrue(phn.isDisplayed());
}
public void viewPrice()
{
	WebElement price=driver.findElement(By.xpath("//span[@class='a-price-whole' and text()='1,799']"));
	Assert.assertTrue(price.isDisplayed());
}
public void availability()
{
	WebElement avail=driver.findElement(By.xpath("//span[text()='Tomorrow, 18 May ']"));
	Assert.assertTrue(avail.isDisplayed());
}
public void addtoCart()
{
	WebElement add=driver.findElement(By.xpath("//button[text()='Add to cart']"));
	Assert.assertTrue(add.isDisplayed());
}
}
