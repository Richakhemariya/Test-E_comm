package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement WOMENL;
	
@ FindBy(xpath=".//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[1]/a")
      WebElement CASUALDL;
	
	public AccountPage(WebDriver driver) throws InterruptedException 
    {
	PageFactory.initElements(driver, this);
	Thread.sleep(3000);
	}

	
	
	public void clickWomen() throws InterruptedException 
	{
	WOMENL.click();
	Thread.sleep(3000);
}
	public void clickCasual() 
	{
		CASUALDL.click();
	
}
}