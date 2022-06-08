package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassAssignmentAutomation {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='example'][6]//option"));
		
		for (int i = 0; i < findElements.size(); i++) {
			String text=findElements.get(i).getText();
			System.out.println(text);
		}
	
	}

}
