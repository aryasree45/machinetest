package testcase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import page.CartPage;
import page.HomePage;
import page.ProductPage;
import page.SearchPage;

public class AmazonTest extends TestBase {
	
HomePage hobj;
SearchPage sobj;
ProductPage pobj;
CartPage cobj;
@BeforeClass
public void objinit()
{
	hobj=new HomePage(driver);
	sobj=new SearchPage(driver);
	pobj=new ProductPage(driver);
	cobj=new CartPage(driver);
}
@Test(priority=1)
public void HomeTest()
{
	String dat=hobj.navigateHome();
	Assert.assertEquals(dat, AutomationConstants.expected_dat);
	String dat1=hobj.cart();
	Assert.assertEquals(dat1, AutomationConstants.exp_txt);
    String dat2=hobj.viewsign();
    Assert.assertEquals(dat2,AutomationConstants.exp_sign);
	
}
@Test(priority=2)
public void Searchproduct()
{
	sobj.searchbox(" boat Bluetooth headphones");
	sobj.searchbtn();
	String act_dat2=sobj.Results();
	Assert.assertEquals(act_dat2, AutomationConstants.exp_result);
}
@Test(priority=3)
public void productDetails()
{
	pobj.selectHeadphn();
	pobj.viewPrice();
	pobj.availability();
	pobj.addtoCart();
	
}
@Test(priority=4)
public void cartadd()
{
	cobj.addproduct();
	cobj.VerifyCart();
	cobj.verifyquantity();
}
}
