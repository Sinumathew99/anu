package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Abpbc {

	WebDriver cd;
	@BeforeTest
	public void setup()
	{
		cd=new ChromeDriver();
		cd.get("https://www.adorebypriyanka.com/");
		cd.get("https://www.adorebypriyanka.com/account/login?return_url=%2Faccount");
		cd.manage().window().maximize();
				

}}
