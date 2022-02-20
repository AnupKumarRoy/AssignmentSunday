package Week2Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/home.html");
		driver.findElement(By.xpath("//h5[text()='Checkbox']/..")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String title1 = "TestLeaf - Interact with Radio buttons";
		if (title.equals(title1)) {
			System.out.println("Test Case Pass");
			
		}else {
			System.out.println("Test Case Fail");
		}
		driver.findElement(By.xpath("(//label[text()='Confirm Selenium is checked']/following::input)[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox']/following::input)[7]")).click();
		
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[3]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[4]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[5]")).click();
	
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
