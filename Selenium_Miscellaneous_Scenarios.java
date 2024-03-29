import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Miscellaneous_Scenarios {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ClaSSiC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();


driver.manage().window().maximize();




//driver.get("https://magnus.jalatechnologies.com/");




/*driver.get("http://www.cookiecentral.com/code/eg1.htm");

/*Cookie myCookie = new Cookie("DemoName", "Cookiesss");
driver.manage().addCookie(myCookie);

// Verify cookie added
Cookie retrievedCookie = driver.manage().getCookieNamed("DemoName");
System.out.println("Cookie added: " + retrievedCookie);

// Delete the cookie
driver.manage().deleteCookieNamed("DemoName");

// Verify cookie deleted
Cookie deletedCookie = driver.manage().getCookieNamed("DemoName");
if (deletedCookie == null) {
    System.out.println("Cookie deleted successfully");
}


//driver.close();
 */
 





//driver.get("https://magnus.jalatechnologies.com/");



/*driver.get("https://demo.automationtesting.in/Datepicker.html");

// Open the calendar widget by clicking on it
WebElement calendarWidget = driver.findElement(By.id("datepicker1")); // Use the actual ID or locator
calendarWidget.click();

// Select the 15th day of the current month
// Adjust the locator based on your calendar's HTML structure
WebElement specificDate = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[1]/input")); 
specificDate.click();

// Continue with other actions...

// Clean up at the end of your session
driver.quit();
*/



/*WebElement table = driver.findElement(By.id("Username"));

// Find rows in the table
List<WebElement> rows = table.findElements(By.tagName("tr"));

// Iterate over each row
for (WebElement row : rows) {
    // Find cells (td or th tags) in the row
    List<WebElement> cells = row.findElements(By.xpath("/html/body/div[2]/div[2]/form/div[2]/input"));
    
    // Iterate over each cell
    for (WebElement cell : cells) {
        // Print the text from each cell
        System.out.print(cell.getText() + " \t ");
    }
    System.out.println();
}

// Clean up
driver.quit();
*/



/*try {
    // Navigate to the page containing the table
    driver.get("https://magnus.jalatechnologies.com/");

    // Locate the table by its unique identifier (e.g., ID, class, etc.)
    WebElement table = driver.findElement(By.id("UserName"));

    // Navigate to the specific cell: 2nd row, 3rd column
    // Note: Rows and columns are usually 1-indexed in HTML, but the exact approach might vary based on the table structure
    WebElement cell = table.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/input"));

    // Retrieve and print the cell's text content
    String cellText = cell.getText();
    System.out.println("Cell Text: " + cellText);
} finally {
    // Close the browser
    driver.quit();
}*/





/*

// Find the table by its ID
WebElement table = driver.findElement(By.id("UserName"));

// Find all the rows in the table
List<WebElement> rows = table.findElements(By.tagName("tr"));

// The size of the rows list will give you the row count
int rowCount = rows.size();

// Print the row count
System.out.println("Number of rows in the table: " + rowCount);

// Close the browser
driver.quit();

*/

/*
// Locate the input field by its ID (or other selector) and enter the search term
WebElement inputField = driver.findElement(By.id("UserName"));
inputField.sendKeys("training@jalaacademy.com");

// Wait for the auto-suggestions to appear using WebDriverWait
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#UserName")));

// Iterate over the suggestions and click the desired one
List<WebElement> suggestions = driver.findElements(By.cssSelector("#UserName"));
for (WebElement suggestion : suggestions) {
    if (suggestion.getText().equals("training@jalaacademy.com")) {
        suggestion.click();
        break;
    }
}


// Close the browser
driver.quit();
*/







/*driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");

// Find the element you want to double click by its locator
WebElement elementToDoubleClick = driver.findElement(By.xpath("/html/body/input"));

// Create instance of Actions class
Actions actions = new Actions(driver);

// Double click on the element
actions.doubleClick(elementToDoubleClick).perform();

// Close the browser
driver.quit();*/






/*try {
    // Navigate to a webpage with elements to hover over
	driver.get("https://magnus.jalatechnologies.com/");

    // Find the element to hover over
    WebElement hoverElement = driver.findElement(By.id("UserName"));

    // Create an instance of Actions class
    Actions actions = new Actions(driver);

    // Move to the element to trigger mouse hover effect
    actions.moveToElement(hoverElement).perform();

    // Add any other actions here (e.g., click on a now-visible element)

} finally {
    // Close the browser
   // driver.quit();
}*/



/*driver.get("https://demo.automationtesting.in/Static.html");

WebElement sourceElement = driver.findElement(By.id("mongo"));
WebElement targetElement = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div"));

// Instantiate the Actions class
Actions actions = new Actions(driver);

// Perform click and hold on the source element, move to the target element, then release and perform the actions
actions.clickAndHold(sourceElement)
        .moveToElement(targetElement)
        .release()
        .build()
        .perform();

// Close the browser
//driver.quit();*/





/*
// Optionally, if you need to focus on a specific element before pressing Enter
WebElement elementToFocus = driver.findElement(By.id("btnLogin"));
elementToFocus.click(); // Or use any other method to focus

// Initialize the Actions class
Actions actions = new Actions(driver);

// Simulate pressing the Enter key
actions.sendKeys(org.openqa.selenium.Keys.ENTER).perform();

// Remember to close the browser
//driver.quit();
 * 
 
 */



/*try {
    // Navigate to a webpage
	driver.get("https://magnus.jalatechnologies.com/");

    // Locate an input element by its ID (replace "inputElementId" with the actual ID)
    WebElement inputElement = driver.findElement(By.id("UserName"));

    // Instantiate the Actions class
    Actions actions = new Actions(driver);

    // Fill in the text field, select all text, and copy it to the clipboard
    actions.sendKeys(inputElement, "Some text")
           .click(inputElement)
           .keyDown(Keys.CONTROL)
           .sendKeys("a") // Select all
           .sendKeys("c") // Copy
           .keyUp(Keys.CONTROL)
           .perform();
} finally {
    // Close the browser
    driver.quit();
}*/






/*driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/




/*driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
driver.findElement(By.id("Password")).sendKeys("jobprogram");
//driver.findElement(By.id("btnLogin")).click();

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// Wait until the element is visible and enabled such that you can click it
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
driver.findElement(By.id("btnLogin")).click();*/





//Set the implicit wait to 10 seconds




/*List<WebElement> links = driver.findElements(By.tagName("a"));

// Iterate over all links to check their HTTP status
for (WebElement link : links) {
    String url = link.getAttribute("href");
    if (url == null || url.isEmpty()) {
        System.out.println("URL is either not configured for anchor tag or it is empty");
        continue;
    }

    try {
        HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());

        // Set request method to HEAD
        huc.setRequestMethod("HEAD");

        // Connect to the URL
        huc.connect();

        // Get the response code
        int respCode = huc.getResponseCode();

        // A response code of 200 is OK, anything else we consider as a broken link
        if (respCode >= 400) {
            System.out.println(url + " is a broken link");
        } else {
            System.out.println(url + " is a valid link");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

// Close the WebDriver
driver.quit();*/



/*driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
driver.findElement(By.id("Password")).sendKeys("jobprogram");
driver.findElement(By.id("btnLogin")).click();
driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[3]/a")).click();
driver.findElement(By.xpath("/html/body/div[2]/aside/section/ul/li[3]/ul/li[11]/a")).click();
driver.findElement(By.xpath("/html/body/div[3]/div/section[2]/form/div/div/div/div/ul/li/a")).click();*/



	}
	    
}