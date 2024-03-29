import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		
  System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		
		
		driver.get("https://magnus.jalatechnologies.com/");
		
		
		
		
		
		
	   // driver.findElement(By.linkText("Admin Login")).click();
	    
	    //driver.findElement(By.partialLinkText("Admin")).click();
	    
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterate over all links and print the URLs
        for (WebElement link : links) {
            // Get the href attribute of the <a> tag
            String url = link.getAttribute("href");
            System.out.println(url);
        }

        // Close the browser
        driver.quit();
	}

}
