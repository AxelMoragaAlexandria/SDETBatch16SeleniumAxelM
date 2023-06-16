package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JavaScriptExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String URL = "http://amazon.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(URL, browser);

        //perform a scroll operation
        //using javaScript

        JavascriptExecutor js=(JavascriptExecutor)driver;


        //scroll down
        js.executeScript("window.scrollBy(0, 500)");
        //Thread.sleep for observation
        Thread.sleep(3000);

        //scroll up
        js.executeScript("window.scrollBy(0, -500)");

        //click on th dropdown
        //use click from jsExecutor
        WebElement DD=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Thread.sleep(3000);

        js.executeScript("arguments[0].click();",DD);



    }
}
