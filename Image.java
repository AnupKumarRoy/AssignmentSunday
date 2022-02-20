package Week2Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leafground.com/home.html");
		String title = driver.getTitle();
		System.out.println(title);
		String title1 = "TestLeaf - Selenium Playground";
		if(title.equals(title1))
		{
		System.out.println("Test Case Pass");
        }else {
	    System.out.println("Test Case Fail");    
        }

		driver.findElement(By.xpath("//h5[text()='Image']/..")).click();
		driver.findElement(By.xpath("(//label[text()='Click on this image to go home page']/following::img)[1]")).click();
       driver.findElement(By.xpath("//label[text()='Am I Broken Image?']")).click();
       
       driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following::img")).click();
       
       driver.close();
			
		
		

	}

}
