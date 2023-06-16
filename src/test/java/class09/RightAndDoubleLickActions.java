package class09;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleLickActions extends CommonMethods {
    public static void main(String[] args)  {
        String URL = "http://demo.guru99.com/test/simple_context_menu.html";
        String browser = "chrome";

        openBrowserAndLaunchApplication(URL, browser);

        //Find the element to be right click
       WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));

       //Actions class
        Actions action=new Actions(driver);

        //right click is also called CONTEXT CLICK
        action.contextClick(rightClickButton).perform();

        //find the element which isedit option
       WebElement editOpt=driver.findElement(By.xpath("//span[text()='Edit']"));
        action.click(editOpt).perform();

        //on clicking on  edit alert appears
        //in order to handle the alert
       Alert alert= driver.switchTo().alert();
       alert.accept();

       //find the webelement double click on
     WebElement doubeClickBtn=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me ')]"));
     action.doubleClick(doubeClickBtn).perform();



    







    }
}
