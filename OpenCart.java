package Week2Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("ruparoy");
		driver.findElement(By.xpath("//div[@class='form-group required']//input")).sendKeys("rupa");
		driver.findElement(By.xpath("//div[@class='form-group required']//input[@id='input-lastname']")).sendKeys("roy");
		driver.findElement(By.xpath("//label[text()='E-Mail']/following-sibling::input")).sendKeys("ruparoy@gmail.com");
		WebElement country = driver.findElement(By.xpath("//label[@for='input-country']/following-sibling::select"));
		Select text = new Select(country);
		text.selectByVisibleText("India");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("Rupa@1234");
		driver.close();
		
		
		
		
		
		
		
		
	}

}
