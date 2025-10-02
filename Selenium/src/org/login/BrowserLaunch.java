package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		//initialize the webBrowser
		WebDriver driver = new ChromeDriver();
		//Launch the URL
		driver.get("https://www.facebook.com/");
		//capture the Title
		String title = driver.getTitle();
		System.out.println(title);
		//to capture the URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//to capture the page source
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		//to close the webpage
		driver.close();
	}

}
