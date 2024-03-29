import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupsAlertsWindows {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		
		/*driver.get("https://magnus.jalatechnologies.com/");
		
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/aside/section/ul/li[3]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
		
		Alert alert = driver.switchTo().alert();

        // Capture the alert message
        String alertMessage = alert.getText();
        System.out.println("Captured alert message: " + alertMessage);

        // Dismiss the alert (clicks 'OK')
        alert.accept();*/
		
		
		/*driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/aside/section/ul/li[3]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
		
Alert promptAlert = driver.switchTo().alert();
        
        // Input text into the alert's text box
        promptAlert.sendKeys("Your text here");
        
        // Accept the alert (click OK)
        promptAlert.accept();
        
        // Perform further actions or validations as needed
        
        // Clean up
        //driver.quit();*/
		
		
		
		/*driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/aside/section/ul/li[3]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
		
		 Alert alert = driver.switchTo().alert();
	        
	        // Get the text of the alert (optional)
	        System.out.println(alert.getText());
	        
	        // To click "OK" on the alert
	        alert.accept();
	        
	        // Alternatively, to click "Cancel" on the alert
	        // alert.dismiss();
	        
	        // Close the browser
	        driver.quit();*/
		
		
		
		
		/*
		 driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/aside/section/ul/li[3]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
		
		Alert alert = driver.switchTo().alert();

        // Click the "OK" button of the alert
        alert.accept();

        // Continue with the rest of your test steps

        // Close the browser
       // driver.quit();
		  */
			
		
		/*
		 driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/aside/section/ul/li[3]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
		
		 Alert alert = driver.switchTo().alert();

	        // Click on the "Cancel" button of the alert
	        alert.dismiss();

	        // Close the browser
	       // driver.quit();
		*/
		
		
		
		
		/*driver.get("https://magnus.jalatechnologies.com/");
		String currentWindowHandle = driver.getWindowHandle();
        System.out.println("Current Window Handle: " + currentWindowHandle);

        // Perform actions on the current window
        // For example, navigate to another URL
        driver.navigate().to("https://www.google.com/");

        // Close the browser
        driver.close();*/
		
		
		
		
		/*driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/aside/section/ul/li[3]/ul/li[8]/a")).click();
	    
	    String originalWindowHandle = driver.getWindowHandle();
	    
		driver.findElement(By.xpath("/html/body/div[3]/div/section[2]/form/div/div[1]/div/div/div/div/div[1]/div[1]/a")).click();
		
		// Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        
        // Switch to the new window
        for (String windowHandle : allWindowHandles) {
            if (!originalWindowHandle.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Perform actions on the new window
        // ...

        // Close the new window and switch back to the original window
        driver.close();
        driver.switchTo().window(originalWindowHandle);

        // Close the original window
      //  driver.quit();*/
		
		
		
		/*driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("/html/body/div[3]/aside/section/ul/li[3]/ul/li[8]/a")).click();
		
	    String originalWindow = driver.getWindowHandle();
	    driver.findElement(By.xpath("/html/body/div[3]/div/section[2]/form/div/div[1]/div/div/div/div/div[1]/div[1]/a")).click();
		
	    for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
		
	    driver.close();
        driver.switchTo().window(originalWindow);

        // Continue with other operations in the original window
        // driver.findElement(By.id("originalWindowElement")).click();

        // Close the browser
        driver.quit();
		
		*/
		
		
		
		//driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//driver.get("https://www.encodedna.com/javascript/demo/open-new-window-using-javascript-method.htm");
		
		
		
		
	        
	        
		

	}

}
