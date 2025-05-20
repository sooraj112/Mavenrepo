package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow extends Base {

	public static void main(String[] args) {
		HandlingMultipleWindow multiple=new HandlingMultipleWindow();
		multiple.initializeBrowser();
		multiple.handlingMultipleWindow();
		//multiple.browserCloseandQuit();
		

	}
public void handlingMultipleWindow() {
	driver.navigate().to("https://demo.guru99.com/popup.php");
	String firstwindowhandleid=driver.getWindowHandle();
	System.out.println(firstwindowhandleid);
	WebElement handle=driver.findElement(By.xpath("//a[text()='Click Here']"));
	handle.click();
	Set<String>handleids=driver.getWindowHandles();
	System.out.println(handleids);
	Iterator<String>values=handleids.iterator();
	while(values.hasNext())
	{
		String currentid=values.next();
		if(!currentid.equals(firstwindowhandleid))
		{
			driver.switchTo().window(currentid);
			WebElement emailid=driver.findElement(By.xpath("//input[@name='emailid']"));
			emailid.sendKeys();
			WebElement submitbutton=driver.findElement(By.xpath("//input[@value='Submit']"));
			submitbutton.click();
		}
	}
}
}
