import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPasswordMismatch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		driver.manage().window().maximize();
				
				try {
				driver.get("https://magnus.jalatechnologies.com/");
				
				
				driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
			    driver.findElement(By.id("Password")).sendKeys("jobprogramm");
			    driver.findElement(By.id("btnLogin")).click();

			    
			    System.out.println("Password mismatch test completed");
				}
				finally{
			    
			    driver.quit();
				}
	}

}
