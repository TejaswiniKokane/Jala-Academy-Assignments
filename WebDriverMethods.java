import java.awt.Dimension;
import java.awt.Point;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
		
		
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		
		driver.get("https://magnus.jalatechnologies.com/");
		
		
		
		
		
		
		
		WebElement element = driver.findElement(By.id("btnLogin"));
		 
        org.openqa.selenium.Point point = element.getLocation();
        System.out.println("x location: " + point.getX());
        System.out.println("y location: " + point.getY());
		
		
		
		
		
		
		
		/*org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		*/
		
		
		
		
		
		
		
		/*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
	
		
		
		
		//driver.close();
		
		
		
		
		
		
		
		
		/*driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();	
		driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/ul/li[1]/a")).click();
		WebElement checkbox = driver.findElement(By.id("rdbFemale"));

        // Check if the checkbox is selected
        boolean isSelected = checkbox.isSelected();

        // Output the result
        System.out.println("Is the checkbox selected? " + isSelected);

        // Close the browser
        driver.quit();*/
		
		
		
		
		
		
		
		
		
		/*WebElement checkbox = driver.findElement(By.id("checkboxId"));

        // Check if the checkbox is selected
        boolean isSelected = checkbox.isSelected();

        // Output the result
        System.out.println("Is the checkbox selected? " + isSelected);

        // Close the browser
        driver.quit();*/
		
		
		
		
		
		
		
		
		/*WebElement element = driver.findElement(By.id("btnLogin"));

		// Check if the element is enabled
		boolean isEnabled = element.isEnabled();

		if (isEnabled) {
		    System.out.println("The element is enabled.");
		} else {
		    System.out.println("The element is disabled.");
		}*/
		
		
		
		
		
		
		
		
		
		/*WebElement element = driver.findElement(By.id("btnLogin"));

		// Check if the element is displayed
		boolean isElementDisplayed = element.isDisplayed();

		// Print the result or perform further actions based on the visibility
		if(isElementDisplayed) {
		    System.out.println("The element is displayed on the page.");
		} else {
		    System.out.println("The element is not displayed on the page.");
		}*/
		
		
		
		
		
		
		
		
		/*WebElement element = driver.findElement(By.id("btnLogin"));

        // Use getText() to retrieve the text content of the element
        String text = element.getText();

        // Output the text
        System.out.println(text);*/
		
		
		
		
		
		
		
		/*WebElement element = driver.findElement(By.id("btnLogin"));

		// Get the tag name of the element
		String tagName = element.getTagName();

		// Print the tag name
		System.out.println("The tag name of the element is: " + tagName);*/
		
		
		
		
		
		
		
		/*WebElement element = driver.findElement(By.id("btnLogin"));

        // Use the getAttribute() method to get the value of an attribute, e.g., 'value'
        String attributeValue = element.getAttribute("value");

        // Print the value of the attribute
        System.out.println("Value of the attribute: " + attributeValue);

        // Close the browser
        driver.quit();*/
		
		
		
		
		
		
		
		
		//driver.findElement(By.id("Password")).sendKeys("jobprogram");
		
		//driver.navigate().refresh();
		
		
		
		
		//driver.navigate().back();
		
		
		//driver.navigate().to("https://magnus.jalatechnologies.com/");
		
		
		
		

        // Navigate to another webpage
        /*driver.get("https://www.google.com");

        // Use the navigate().back() method to go back to the previous page
        driver.navigate().back();

        // Use the navigate().forward() method to move forward in the browser history
        driver.navigate().forward();

        // Close the browser
        driver.quit();*/
    
		
		
		
		
		
		
		
		// Switch to a frame using its index (e.g., 0 for the first frame)
       /* driver.switchTo().frame(1);

        // Now you can interact with elements inside the frame
        // For example, find an element inside the frame and click it
        driver.findElement(By.id("btnLogin")).click();

        // Switch back to the main document (outside of any frames)
        driver.switchTo().defaultContent();

        // Continue interacting with elements outside of frames

        // Clean up at the end of the test
        driver.quit();*/

		
		
		
		
		
		
		
		
		
		
		/*Set<String> windowHandles = driver.getWindowHandles();

        // Iterate over window handles
        for (String handle : windowHandles) {
            // Switch to each window
            driver.switchTo().window(handle);

            // Perform operations in the new window/tab (e.g., get the title)
            System.out.println("Window/Tab Title: " + driver.getTitle());
        }

        // Close the browser
        driver.quit();*/
		
		
		
		
		
		
		
		/*String currentWindowHandle = driver.getWindowHandle();
		System.out.println("Current Window Handle: " + currentWindowHandle);
        driver.quit();*/
		
		
		
	
		
		
		
		
		/*List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterate through the list of elements and print the text of each link
        for(WebElement link : links) {
            System.out.println(link.getText());
        }

        // Close the browser
        driver.quit();*/
		
		
		
		
		
		
		
		
		
		/*WebElement elementById = driver.findElement(By.id("btnLogin"));
		elementById.click();
       
        WebElement elementByCssSelector = driver.findElement(By.cssSelector("#btnLogin"));
        elementByCssSelector.click();
        
       driver.quit();*/
		
		
		
		
		
		
		
		
		
		/*String pageSource = driver.getPageSource();

        // Print the page source
        System.out.println(pageSource);*/
		
		
		
		
		
		
		
		/*String pageTitle = driver.getTitle();
        System.out.println("Page Title is: " + pageTitle);

        // Close the browser
        driver.quit();*/
		
		
		
		
		
		
		 /*String currentUrl = driver.getCurrentUrl();

	        // Print the current URL to the console
	        System.out.println("The current URL is: " + currentUrl);

	        // Close the browser
	        driver.quit();*/
		
		
	}

}
