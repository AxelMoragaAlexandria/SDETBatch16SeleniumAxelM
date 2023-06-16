package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KEYSDEMO extends CommonMethods {
    public static void main(String[] args) {
        String URL = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        String browser = "chrome";

        openBrowserAndLaunchApplication(URL, browser);

        //locate the text box UserName
      WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
      userName.sendKeys("Tester", Keys.TAB);

      //locate the password text box
     WebElement passWord= driver.findElement(By.xpath("//input[@type='password']"));
     passWord.sendKeys("test",Keys.ENTER);






    }
}
