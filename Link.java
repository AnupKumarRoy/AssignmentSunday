package Week2Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/home.html");
		driver.findElement(By.xpath("//h5[text()='HyperLink']/..")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//h5[text()='HyperLink']/..")).click();
		String cssValue = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getCssValue("color");
        System.out.println(cssValue);
        Point location = driver.findElement(By.linkText("Verify am I broken?")).getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.print(x+",");
		System.out.println(y);
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//h5[text()='HyperLink']/..")).click();
		int link = driver.findElements(By.tagName("a")).size();
		System.out.println("No.of Links in the Web is "+link);
	    
	
		
		
		
		
		
		
		
		
		
		
	}

}
