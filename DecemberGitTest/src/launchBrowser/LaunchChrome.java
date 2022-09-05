package launchBrowser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome extends Abc{
	
	public static void main(String[] args) throws InterruptedException {
		//Set Property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\December2021_Selenium\\1st_Selenium\\drivers\\chromedriver.exe");
		//Object create of WebDriver
		WebDriver driver = new ChromeDriver(); //object variable
		//Go to web site
		driver.get("https://www.amazon.com/");
		//Maximize browser
		driver.manage().window().maximize();
		//Stop execution
		Thread.sleep(3000);
		//Close Browser
		driver.close();
		
		//object creation
		Abc obj = new Abc();
//		obj.sta
		
		//inherit 
		staticMethod();
		
	
		//by class name
		Abc.
		
	}

}
