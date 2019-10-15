package LibraryFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url)
	{
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
	        driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
