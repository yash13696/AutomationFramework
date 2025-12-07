package contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainClass.MainClass;

public class CreateContacts extends MainClass {

	public static void createContacts() {
		// 1. Click on the Contacts and Plus button
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();

		// 2. Enter required details in Contacts form
		WebElement contactLastName = driver.findElement(By.cssSelector("input[name='lastname']"));
		String contactLastExpName = "test2";
		contactLastName.sendKeys(contactLastExpName);

		// 3. Submitting the Contacts form
		driver.findElement(By.cssSelector("input[value='  Save  ']")).click();

		// 4. Verification

		String contactLastActName = driver.findElement(By.cssSelector("span[id='dtlview_Last Name']")).getText();

		if (contactLastExpName.compareTo(contactLastActName) == 0) {

			System.out.println("Contact Successfully Created and Verified...");
		} else
			System.out.println("Verification Failed...");

	}
}
