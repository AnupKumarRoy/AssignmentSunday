package Week2Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/home.html");
		driver.findElement(By.xpath("//h5[text()='Edit']/..")).click();
		driver.findElement(By.id("email")).sendKeys("anup@gmail.com");
		WebElement findElement = driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input"));
		findElement.clear();
		findElement.sendKeys("aaaaa",Keys.TAB);
		String attribute = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean enabled = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled();
		System.out.println(enabled);
		
		
		
		
		
		
		
	}

}
