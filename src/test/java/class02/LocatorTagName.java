package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorTagName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //navigate to the amazon.com
        driver.get("https://amazon.com/");
        //maxime the screen
        driver.manage().window().maximize();
//get all the links from amazon.com and print them on the console
     List<WebElement> allLinks=driver.findElements(By.tagName("a"));
     //tranverse
        for(WebElement link:allLinks){

          String linkOfWebsite= link.getAttribute("href");
            System.out.println(linkOfWebsite);
        }








    }
}
