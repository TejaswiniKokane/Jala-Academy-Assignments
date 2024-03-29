import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
		
			driver.manage().window().maximize();
			
			
			driver.get("https://magnus.jalatechnologies.com/");
			
			
			
			
			
			
			
			
			
			
			
			//driver.findElement(By.xpath("//input[@id='Password'][@name='Password']")).sendKeys("jobprogram");
			
			
			
			
			
			/*List<WebElement> followingSiblings = driver.findElements(By.xpath("//*[@id='Password']/following-sibling::div"));
	        for(WebElement sibling : followingSiblings) {
	            System.out.println(sibling.getText());
	        }

	        // Find preceding siblings of an element
	        List<WebElement> precedingSiblings = driver.findElements(By.xpath("//*[@id='Password']/preceding-sibling::div"));
	        for(WebElement sibling : precedingSiblings) {
	            System.out.println(sibling.getText());
	        }

	        //driver.quit();*/
			
			
			
			
			
			
			/*WebElement link = driver.findElement(By.xpath("//a[starts-with(@href, '/Account/ForgotPassword')]"));

	        // Now you can interact with the found element, for example, click on it
	        link.click();*/
			
			
			
			
			/*WebElement element = driver.findElement(By.xpath("//tagname[starts-with(@attribute, 'checkmark')]"));
			element.click();*/
			
			
			

	       /* WebElement element = driver.findElement(By.xpath("//*[text()='Admin Login']"));

	        // Perform actions on the element, like clicking or retrieving its attribute
	        element.click();
	        
	        // Close the browser
	       // driver.quit();*/
			
			
			
			
			/*WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'Forgot')]"));
			

	        // Now you can interact with the found element
	        // For example, print its text
	        System.out.println(element.getText());

	        // Close the browser
	        driver.quit();*/
	        
	        
	        
			
			
			
			
			
			/*WebElement elementById = driver.findElement(By.xpath("//*[@id='Password']"));
			elementById.sendKeys("jobprogram");
	        
	        // Locate element by Name
	      WebElement elementByName = driver.findElement(By.xpath("//*[@name='UserName']"));
	      elementByName.sendKeys("training@jalaacademy.com");
	        
	        // Locate element by Class Name
	       WebElement elementByClassName = driver.findElement(By.xpath("//*[@class='btn btn-primary btn-flat']"));
	       elementByClassName.click();

	        

	        // Close the browser
	       // driver.quit();*/
			
			
			
			
		
		/*WebElement label = driver.findElement(By.id("btnLogin"));

        // Get the text of the label
        String labelText = label.getText();

        // Get the color of the label text
        String labelColor = label.getCssValue("color");

        // Output the label's text and color to the console
        System.out.println("Label text: " + labelText);
        System.out.println("Label color: " + labelColor);

        // Close the browser
        driver.quit();*/
			
			
			
			//driver.findElement(By.xpath("//div@class='form-group has-feedback'/descendant-or-self::input")).sendKeys("jobprogram");

	}

}
