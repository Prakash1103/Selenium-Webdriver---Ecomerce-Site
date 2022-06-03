package Week5Day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the Driver And setup the Path
        WebDriverManager.chromedriver().setup();
        //launch the Browser
        ChromeDriver driver=new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        //go to URL
        driver.get("https://www.nykaa.com/");
        //Implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        WebElement element = driver.findElement(By.xpath("//a[text()='brands']"));
        //Action
        Actions builder=new Actions(driver);
        builder.moveToElement(element).perform();
        driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
        driver.findElement(By.linkText("L'Oreal Paris")).click();
        //get title
        System.out.println(driver.getTitle());
        
        
        }

}
