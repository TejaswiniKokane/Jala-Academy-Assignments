import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomationTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
				
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		
		
		driver.get("https://magnus.jalatechnologies.com/");
		
			
	   driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();	
		driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/ul/li[1]/a")).click();
		//driver.findElement(By.name("rdbGender")).click();
		
		
       
		
		
		
		
		
		

		
		


		
		
		
		
		//driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/a")).click();
		
		
		//driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/ul/li[1]/a")).click();
	
		
		
		

		//driver.findElement(By.partialLinkText("JALA Technologies")).click();
		
		
		//driver.findElement(By.xpath("/html/body/div[3]/aside/section/ul/li[3]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"MenusDashboard\"]/li[2]/ul/li[1]/a")).click();		
		
		
		
		
		//driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");		 
		//driver.findElement(By.id("UserName")).clear();
		
		
		 		
		//driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/div[1]/label/span")).click();
		
		
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/div[1]/a")).click();
		
		//boolean Email= driver.findElement(By.id("UserName")).isEnabled();
				//System.out.print(Email);
				
		
	}

}
