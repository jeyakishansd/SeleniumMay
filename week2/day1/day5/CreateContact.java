package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	      
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Create Contact")).click();
	 driver.findElement(By.id("firstNameField")).sendKeys("JEYAKISHAN");
	 driver.findElement(By.id("lastNameField")).sendKeys("S D");
	 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("JEY");
	 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("KEE");
	 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mechanical");
	 driver.findElement(By.id("createContactForm_description")).sendKeys("Moto Enthusiast");
	 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jeykee@gmail.com");
	 WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	 Select s = new Select(state);
	 s.selectByVisibleText("New York");
	 driver.findElement(By.name("submitButton")).click();
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.id("updateContactForm_description")).clear();
	 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Description is cleared");
	 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	 String title = driver.getTitle();
	 System.out.println(title);
	 
}
}