import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginWithoutUsername {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		driver.manage().window().maximize();
				
				try {
				driver.get("https://magnus.jalatechnologies.com/");
				
				
				
			    driver.findElement(By.id("Password")).sendKeys("jobprogram");
			    driver.findElement(By.id("btnLogin")).click();

			    
			    System.out.println("No username test completed");
				}
				finally{
			    
			    driver.quit();
				}

	}

}
