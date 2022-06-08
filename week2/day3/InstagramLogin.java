package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstagramLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://instagram.com");
		driver.findElement(By.name("username")).sendKeys("jeyaki.kishan@gmail.com");
		driver.findElement(By.name("password")).sendKeys("kishan99");
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
	}
}
