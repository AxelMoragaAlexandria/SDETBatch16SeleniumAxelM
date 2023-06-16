package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSdemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
                driver.get("https://www.facebook.com/");
                driver.manage().window().maximize();

                //click on create new account
                 WebElement createNewAccount= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
                 createNewAccount.click();
                 //because the DOM doesn't have firstName by default it only shows
                //up after clicking on create new account and the code takes some time to appear in DOm for firstName
                // so we must add a sleep here
                    Thread.sleep(2000);
                 //enter the first name
               WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
                    firstName.sendKeys("Axel");




    }
}
