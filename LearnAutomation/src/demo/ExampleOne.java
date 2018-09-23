package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOne {
	public static String driverPath = "C://Users//dell//Desktop//2018//";
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		 driver= new ChromeDriver();
			//driver.manage().window().maximize();
		 driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");	 
		s

	}

}
