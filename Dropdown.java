import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		
		driver.get("https://magnus.jalatechnologies.com/");
		
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
	    driver.findElement(By.id("Password")).sendKeys("jobprogram");
	    driver.findElement(By.id("btnLogin")).click();	
		driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[2]/ul/li[1]/a")).click();
		
		
		
		
		
		
		/*WebElement dropdownElement = driver.findElement(By.id("CountryId"));

        // Create a Select object for the dropdown element
        Select dropdown = new Select(dropdownElement);

        // Select the option at index 2 (third option in the list)
        dropdown.selectByIndex(5);

        // Close the browser
        //driver.quit();*/
		
		
		
		
		
		/*WebElement dropdownElement = driver.findElement(By.id("CountryId"));

        // Create an instance of the Select class
        Select dropdown = new Select(dropdownElement);

        // Select the option by visible text
        dropdown.selectByVisibleText("Sri Lanka");

        // Close the browser
        //driver.quit();*/
		
		
		
		
		
		/*WebElement dropdownElement = driver.findElement(By.id("CountryId"));

        // Create an instance of the Select class
        Select dropdown = new Select(dropdownElement);

        // Select the option by value
        dropdown.selectByValue("1");

        // Close the browser
        //driver.quit();*/
		
		
		
		
		
		/*WebElement dropdownElement = driver.findElement(By.id("CountryId"));

        // Instantiate the Select object with the dropdown WebElement
        Select dropdown = new Select(dropdownElement);

        // Get the first selected option
        WebElement firstSelectedOption = dropdown.getFirstSelectedOption();

        // Print the text of the first selected option
        System.out.println("First selected option: " + firstSelectedOption.getText());

        // Close the browser
        driver.quit();*/
		
		
		
		
		/*WebElement dropdownElement = driver.findElement(By.id("CountryId")); 

        // Create a Select object with the located dropdown element
        Select dropdown = new Select(dropdownElement);

        // Get all the options in the dropdown
        List<WebElement> options = dropdown.getOptions();

        // Iterate through the options and print their text
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();*/

	}

}
