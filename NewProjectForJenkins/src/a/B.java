package a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class B {
	
	@Test
	public void firefoxTest(){
		WebDriver driver = new FirefoxDriver();
		driver.get("");
	}

}
