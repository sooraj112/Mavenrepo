package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {

	public static void main(String[] args) {
		HandlingAlerts alert=new HandlingAlerts();
		alert.initializeBrowser();
		//alert.verifyConfirmAlert();
		//alert.verifyAlerts();
		alert.verifyPromptAlert();
		//alert.browserCloseandQuit();

	}
public void verifyAlerts()
	{
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement clickme=driver.findElement(By.xpath("//button[@id='alertButton']"));
	clickme.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();

	}
public void verifyConfirmAlert()
	{
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement confirm=driver.findElement(By.xpath("//button[@id='confirmButton'"));
	confirm.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	}
public void verifyPromptAlert()
	{
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement prompt=driver.findElement(By.xpath("//button[@id='promtButton']"));
	prompt.click();
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("Sooraj");
	alert.accept();
	}
}
