package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=dms_searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gad_campaignid=20443628324&gbraid=0AAAAADoxBh5OMasai8g5zQmgrkn7Es76-&gclid=EAIaIQobChMI64PfkoKujwMVp9AWBR3-FAylEAAYASAAEgKOwvD_BwE");
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement menu = driver.findElement(By.xpath("(//a[@class='desktop-main'])[2]"));
		a.moveToElement(menu).perform();
		
		Thread.sleep(2000);
		WebElement menuItem = driver.findElement(By.linkText("Sarees"));
		a.click(menuItem).perform();
		
		Thread.sleep(2000);
		
		WebElement minPrice = driver.findElement(By.id("rootRailThumbLeft"));
		a.dragAndDropBy(minPrice, 50, 0).perform();
		Thread.sleep(2000);
		
	}

}


