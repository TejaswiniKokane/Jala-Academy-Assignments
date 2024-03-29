import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	   // driver.findElement(By.id("btnLogin")).click();	
	    
	    /*WebDriver driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		
		
		WebElement Email = driver.findElement(By.id("UserName"));
		Email.sendKeys("training@jalaacademy.com");
		Email.clear();
		System.out.println("Full name : "+Email.getAttribute("value"));
		
		
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("jobprogram");
		System.out.println("Email address :"+ password.getAttribute("value"));*/
	    
	    /*WebElement textBox = driver.findElement(By.id("Password"));

        // Check if the text box is enabled
        boolean isEnabled = textBox.isEnabled();

        // Print the result
        if(isEnabled) {
            System.out.println("The text box is enabled.");
        } else {
            System.out.println("The text box is disabled.");
        }

        // Close the browser
        driver.quit();*/

	}

}
