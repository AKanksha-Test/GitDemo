package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\chrome-win32.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}