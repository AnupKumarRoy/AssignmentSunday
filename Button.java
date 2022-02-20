package Week2Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/home.html");
		driver.findElement(By.xpath("//h5[text()='Button']/..")).click();
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//h5[text()='Button']/..")).click();
		Point location = driver.findElement(By.id("position")).getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.print(x);
		System.out.print(",");
		System.out.print(y);
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(",");
		System.out.println(cssValue);
		Dimension size = driver.findElement(By.id("size")).getSize();
		int h = size.height;
		int w = size.width;
		System.out.print(h);
		System.out.print(",");
		System.out.print(w);
		
		
		
		
	}

}
