package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void addproduct()
	{
		WebElement product=driver.findElement(By.xpath("//button[text()='Add to cart']"));
		product.click();
		WebElement btnclick=driver.findElement(By.xpath("//span[@class='nav-cart-count nav-progressive-attribute nav-progressive-content nav-cart-1']"));
		btnclick.click();
	}
	public void VerifyCart()
	{
		WebElement verifyct=driver.findElement(By.xpath("//h2[@class='a-size-extra-large a-text-normal']"));
		Assert.assertTrue(verifyct.isDisplayed());
	}
	public void verifyquantity()
	{
		WebElement quant=driver.findElement(By.xpath("//span[@data-a-selector='value']"));
		
		Assert.assertTrue(quant.isDisplayed());
	}
}
