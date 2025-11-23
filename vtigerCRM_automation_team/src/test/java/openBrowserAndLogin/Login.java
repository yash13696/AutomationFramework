package openBrowserAndLogin;

import org.openqa.selenium.By;

import mainClass.MainClass;

public class Login extends MainClass {
	public static void login() {
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		
	}
	
}
