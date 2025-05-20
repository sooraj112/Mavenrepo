package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementsCommands extends Base {
	public void handlingWebElements() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messagebox.sendKeys("hello");
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		button.click();
		WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourmessage.getText());
		messagebox.clear();
		WebElement valuea=driver.findElement(By.id("value-a"));
		System.out.println(valuea.getTagName());
		
		}
	

	public static void main(String[] args) {
		WebElementsCommands element=new WebElementsCommands();
		element.initializeBrowser();
		element.handlingWebElements();
		//element.browserCloseandQuit();

	}

}
