package mainClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import contacts.CreateContacts;
import leads.CreateLeads;
import openBrowserAndLogin.Login;
import openBrowserAndLogin.OpenBrowser;
import organizations.CreateOrganization;


public class MainClass {
	public static WebDriver driver=new ChromeDriver();
	public static void main(String[] args) {
		OpenBrowser.browserOpen();
		Login.login();
		CreateLeads.createLead();
		CreateOrganization.createOrganization();
		CreateContacts.createContacts();
		driver.close();
		
	}

}
