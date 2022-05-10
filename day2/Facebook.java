package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Jey Kee");
		driver.findElement(By.name("lastname")).sendKeys("kishan");
		driver.findElement(By.name("reg_email__")).sendKeys("jeykee@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jeykee@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("asdfgf1234");
		WebElement date = driver.findElement(By.id("day"));
		Select day= new Select(date);
		day.selectByVisibleText("3");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select june= new Select(month);
		june.selectByVisibleText("Jun");
		WebElement year = driver.findElement(By.id("year"));
		Select yaer= new Select(year);
		yaer.selectByVisibleText("1999");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}
}
