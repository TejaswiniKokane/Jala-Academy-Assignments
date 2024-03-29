import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import dev.failsafe.internal.util.Assert;

public class LoginTests {
	
	private WebDriver driver;
	public void setUp() {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		driver.manage().window().maximize();
				
		driver.get("https://magnus.jalatechnologies.com/");
		
	}
	@Test
	
	public void FormFill() {
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();

	    //Assert.assertTrue(true, "Registration successful");
	}

	

	

}
