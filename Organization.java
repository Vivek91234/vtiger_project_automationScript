package v;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class Organization {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.xpath("//span[text()=' MARKETING']")).click();
	   WebElement e=driver.findElement(By.xpath("(//span[text()=' Organizations'])[1]"));//click();
	  
	   Actions a=new Actions(driver);
		a.moveToElement(e).click().perform();
		
		driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("saving");
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("123456789");
		driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("2345");
		driver.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("435234567");
		driver.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("vivek@gmail.com");
		driver.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("vivek");
		driver.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("425414");
		driver.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("50000");
		/**/
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("google.com");
		driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("hearts");
		driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("5000");
		driver.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("vivek234@gmail.com");
		driver.findElement(By.id("s2id_autogen1")).click();
		driver.findElement(By.xpath("//div[text()='Banking']")).click();
		driver.findElement(By.id("s2id_autogen5")).click();
		driver.findElement(By.xpath("//div[text()='Competitor']")).click();
		driver.findElement(By.id("s2id_autogen3")).click();
		driver.findElement(By.xpath("//div[text()='Active']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		/**/
		driver.findElement(By.id("s2id_autogen7")).click();
		driver.findElement(By.xpath("//div[text()='Support Group']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		/**/
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("savinglllllllllllll");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_pobox")).sendKeys("456");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("nandurbar");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("maharashtra");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("425414");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("india");
		/**/
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("savinglllllllllllll");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_pobox")).sendKeys("333");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("pune");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("maharashtra");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_code")).sendKeys("412307");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("india");
		/**/
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("The product is "
				+ "sheeped to the designated address");
		/* save */
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
