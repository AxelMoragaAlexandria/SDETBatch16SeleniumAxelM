package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {

        String URL = "https://jqueryui.com/droppable/";
        String browser = "chrome";

        openBrowserAndLaunchApplication(URL, browser);
        //As the element is inside an iframe so first we need to switch focus
        driver.switchTo().frame(0);

        //find the draggable WebElement
        WebElement dragable=driver.findElement(By.xpath("//div[@id='draggable']"));
        //find the element where we want to drop
       WebElement dropable= driver.findElement(By.xpath("//div[@id='droppable']"));

       //Action class
        Actions action=new Actions(driver);
        action.dragAndDrop(dragable,dropable).perform();



    }
}
