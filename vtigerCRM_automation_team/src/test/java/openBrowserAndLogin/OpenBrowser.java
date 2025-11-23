package openBrowserAndLogin;

import java.time.Duration;
import mainClass.MainClass;

public class OpenBrowser extends MainClass {
	
	public static void browserOpen() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

	}
	

}
