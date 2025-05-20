package seleniumBasics;

public class WebDriverMethods extends Base{
	public void handlingWebDriverMethods()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		String pagesourse=driver.getPageSource();
		System.out.println(pagesourse);
		String handleid=driver.getWindowHandle();
		System.out.println(handleid);
	}
	

	public static void main(String[] args) {
		WebDriverMethods drivermethods=new WebDriverMethods();
		drivermethods.initializeBrowser();
		drivermethods.handlingWebDriverMethods();
		//drivermethods.browserCloseandQuit();

	}

}
