package a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rootPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",rootPath+"/TestData/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		

	}*/
	
	@Test
	public void browserTest(){
			String rootPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",rootPath+"/TestData/chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
	}
	
	@Test
	public void bTest(){
		
	}

}
