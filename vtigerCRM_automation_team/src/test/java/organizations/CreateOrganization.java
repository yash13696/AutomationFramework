package organizations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainClass.MainClass;

public class CreateOrganization extends MainClass {

	public static void createOrganization() {
		
		//1. Click on the Organizations and Plus button
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		
		//2. Enter required details in Organizations form
		WebElement orgName=driver.findElement(By.cssSelector("input[name='accountname']"));
		String orgExpName="test2";	
		orgName.sendKeys(orgExpName);
		
		//3. Submitting the Leads form
		driver.findElement(By.cssSelector("input[value=' save ']")).click();;
		
		
		//4. Verification
		
		String orgActName= driver.findElement(By.cssSelector("span[id='dtlview_Organization Name']")).getText();		
		
		if(orgExpName.compareTo(orgActName)==0)
		{
			
			System.out.println("Organization Successfully Created and Verified...");
		}
		else
			System.out.println("Verification Failed...");
		
	}
}