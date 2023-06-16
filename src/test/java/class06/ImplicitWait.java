package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String URL="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(URL,browser);

        //declaring the implicit wait in the start as it is a global wait, and we want it to be implemented on all
        //the web elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       WebElement createNewAccountBtn=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
       createNewAccountBtn.click();

       //Send the first name
     WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
     sendText("abracadra",firstname);



    }
}


