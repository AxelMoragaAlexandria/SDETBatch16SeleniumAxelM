package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo1 extends CommonMethods {
    public static void main(String[] args) {

        String URL = "http://amazon.com/";
        String browser = "chrome";

        openBrowserAndLaunchApplication(URL, browser);

        //find the webElement that you want to hover your curser to
     WebElement signIn=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));

     //Action class
        Actions action=new Actions(driver);

        //Perform the desired action
        action.moveToElement(signIn);



    }
}
