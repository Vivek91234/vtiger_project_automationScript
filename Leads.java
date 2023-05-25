package v;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Leads {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.xpath("//span[text()=' MARKETING']")).click();
	   WebElement e=driver.findElement(By.xpath("//span[text()=' Leads']"));//click();
	  
	    Actions a=new Actions(driver);
		a.moveToElement(e).click().perform();
		
		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
				/**/
		driver.findElement(By.id("s2id_autogen1")).click();
		driver.findElement(By.xpath("//div[text()='Mr.']")).click();
		driver.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys("vivek");
		driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("valvi");
		driver.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("flipkart");
		driver.findElement(By.id("Leads_editView_fieldName_phone")).sendKeys("123456789");
		driver.findElement(By.id("Leads_editView_fieldName_mobile")).sendKeys("234523432");
		driver.findElement(By.id("Leads_editView_fieldName_designation")).sendKeys("developer");
		driver.findElement(By.id("Leads_editView_fieldName_fax")).sendKeys("435234567");
		driver.findElement(By.id("Leads_editView_fieldName_email")).sendKeys("vivek@gmail.com");
		driver.findElement(By.id("Leads_editView_fieldName_website")).sendKeys("www.google.com");
		
		
		driver.findElement(By.id("s2id_autogen3")).click();
		driver.findElement(By.xpath("//div[text()='Employee']")).click();
		
		driver.findElement(By.id("s2id_autogen5")).click();
		driver.findElement(By.xpath("//div[text()='Biotechnology']")).click();
		
		driver.findElement(By.id("Leads_editView_fieldName_annualrevenue")).sendKeys("50000");
		driver.findElement(By.id("Leads_editView_fieldName_noofemployees")).sendKeys("3000");
		
		driver.findElement(By.id("s2id_autogen7")).click();
		driver.findElement(By.xpath("//div[text()='Cold']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.id("s2id_autogen9")).click();
		driver.findElement(By.xpath("//div[text()='Active']")).click();
		/**/
		driver.findElement(By.id("Leads_editView_fieldName_secondaryemail")).sendKeys("vivek12@gmail.com");
		driver.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();
		/* drop down */
		driver.findElement(By.id("s2id_autogen11")).click();
		driver.findElement(By.xpath("//div[text()='Support Group']")).click();
		/**/
		driver.findElement(By.id("Leads_editView_fieldName_lane")).sendKeys("solapur road");
		driver.findElement(By.id("Leads_editView_fieldName_code")).sendKeys("1234");
		driver.findElement(By.id("Leads_editView_fieldName_country")).sendKeys("india");
		driver.findElement(By.id("Leads_editView_fieldName_pobox")).sendKeys("2sd");
		driver.findElement(By.id("Leads_editView_fieldName_city")).sendKeys("pune");
		driver.findElement(By.id("Leads_editView_fieldName_state")).sendKeys("Maharashtra");
		driver.findElement(By.id("Leads_editView_fieldName_description")).sendKeys("he is all good to go");
		driver.findElement(By.xpath("//button[text()='Save']")).click();	
	}

}
