import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

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
		
		//driver.findElement(By.id("rdbFemale")).click();
		
		
		
		
		
		
		 WebElement radioButton = driver.findElement(By.id("rdbFemale"));

	        // Check if the radio button is enabled
	        boolean isEnabled = radioButton.isEnabled();

	        // Print the status
	        System.out.println("Is the radio button enabled? " + isEnabled);

	        // Close the browser
	       // driver.quit();
		
		
		
		 /*WebElement radioButton = driver.findElement(By.id("rdbMale"));

	        // Check if the radio button is selected
	        boolean isSelected = radioButton.isSelected();

	        // Print the selection status
	        System.out.println("Radio button selected: " + isSelected);

	        // Close the browser
	        driver.quit();*/
		
		

		/*List<WebElement> radioButtons = driver.findElements(By.name("rdbGender"));

        String labelText = "";
        for (WebElement radioButton : radioButtons) {
            if (radioButton.isSelected()) {
                // If the radio button is wrapped by the label
                WebElement label = radioButton.findElement(By.xpath("/html/body/div[3]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/input[1]"));
                
                // If the label is associated using the 'for' attribute
                // String radioButtonId = radioButton.getAttribute("id");
                // WebElement label = driver.findElement(By.xpath("//label[@for='" + radioButtonId + "']"));
                
                labelText = label.getText();
                break; // Exit the loop once the selected radio button is found
            }
        }

        System.out.println("Selected radio button label text: " + labelText);

        // Close the browser
        driver.quit();*/
		
		
         /*List <WebElement> radioboxes = driver.findElements(By.xpath("/html/body/div[3]/div/section[2]/div/form/div[1]/div/div[2]/div[3]/input[2]"));
		
		System.out.println("Total radio buttons :"+radioboxes.size());*/
		
		
		
		
		/* List<WebElement> radioButtons = driver.findElements(By.name("rdbGender"));
	        
	        // Iterate over the list of radio buttons and print their values
	        for (WebElement radioButton : radioButtons) {
	            String value = radioButton.getAttribute("value");
	            System.out.println("Radio Button Value: " + value);
	            
	            // Optionally, check if the radio button is selected
	            boolean isSelected = radioButton.isSelected();
	            System.out.println("Is selected? " + isSelected);
	        }
	        
	        // Close the browser
	        driver.quit();*/
		
		

	}

}
