package webseldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestLoginPage {
	
	@Test	
	public void myTest() {
		System.out.println("Hello Team");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println(title);
				
        WebElement username = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));
 
        username.clear();
        System.out.println("Entering the UserName");
        username.sendKeys("9591068070");
 
        password.clear();
        System.out.println("entering the password");
        password.sendKeys("bhagyashree123");
 
        System.out.println("Clicking login button");
        loginButton.click();
 
        String successfulloginpagetitle = "Facebook – log in or sign up";
 
        String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);		
 
        System.out.println("Verifying the page title has started");
        
		Assert.assertEquals(actualTitle,successfulloginpagetitle,"Page title doesnt match. Login Failed");
 
        System.out.println("The page title has been successfully verified");
 
        System.out.println("User logged in successfully");

	}	
}


