package class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String URL = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(URL, browser);


        //press the login btn
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginBtn);



        //declare the instance
        TakesScreenshot ts=(TakesScreenshot) driver;
        //take screenshot as output type FILE
        File screenshot=ts.getScreenshotAs(OutputType.FILE);

        //save it in your computer
        FileUtils.copyFile(screenshot,new File("/Users/axelmoraga/IdeaProjects/SDETBatch16Selenium/screenshots/SyntaxLogin.png"));


//HomeWork:
//create a method in Common methods for screenshot
//it should take file name as a parameter.
    }
}
