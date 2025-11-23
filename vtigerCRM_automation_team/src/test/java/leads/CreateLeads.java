package leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainClass.MainClass;


public class CreateLeads extends MainClass {
	public static void createLead() {
		
		//1. Click on the Lead and Plus button
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.cssSelector("img[title='Create Lead...']")).click();
		
		//2. Enter required details in Leads form
		WebElement lastName=driver.findElement(By.cssSelector("input[name='lastname']"));
		WebElement company=driver.findElement(By.cssSelector("input[name='company']"));
		String name="test2";	
		String companyName="company2";
		lastName.sendKeys(name);
		company.sendKeys(companyName);
		
		//3. Submitting the Leads form
		driver.findElement(By.cssSelector("input[type='submit']")).click();;
		
		
		//4. Verification
		
		String lastNameActual= driver.findElement(By.cssSelector("span[id='dtlview_Last Name']")).getText();		
		
		if(name.compareTo(lastNameActual)==0)
		{
			
			System.out.println("Lead Successfully Created and Verified...");
		}
		else
			System.out.println("Verification Failed...");
		
		
	}
	

}
