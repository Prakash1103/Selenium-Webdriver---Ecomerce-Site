package Week5Day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download the Driver And setup the Path
        WebDriverManager.chromedriver().setup();
        //launch the Browser
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notifications");
        ChromeDriver driver=new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        //go to URL
        driver.get("https://www.snapdeal.com/");
        //Implicity wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        WebElement element = driver.findElement(By.linkText("Men's Fashion"));
        Actions builder=new Actions(driver);
        builder.moveToElement(element).perform();
        driver.findElement(By.className("linkTest")).click();
        
        String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println(text);
       
       }

}
