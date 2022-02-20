package Week2Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='field error']/input")).sendKeys("Kumar");
	driver.findElement(By.xpath("//div[@class='lastName textFieldInput section']//input")).sendKeys("Roy");
	driver.findElement(By.xpath("//div[@class='emailInput textFieldInput section']//input")).sendKeys("roy@gmail.com");
	driver.findElement(By.xpath("//div[@class='company textFieldInput section']//input")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("//div[@class='phoneInput textFieldInput section']//input")).sendKeys("7894651300");
	WebElement jobTitle = driver.findElement(By.xpath("//div[@class='userTitle selectFieldInput section']//select"));
    Select text = new Select(jobTitle);
    text.selectByVisibleText("IT Manager");
    WebElement employees = driver.findElement(By.xpath("//div[@class='companyEmployees selectFieldInput section']//select"));
    Select value = new Select(employees);
    value.selectByValue("9");
    WebElement country = driver.findElement(By.xpath("//div[@class='country_field selectFieldInput']//select"));
    Select text1 = new Select(country);
    text1.selectByVisibleText("India"); 
	driver.close();
    
	}

}
