package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethods {

            public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url,String browser){

        switch(browser){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
        //maximize the window
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(url);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser(){
        if(driver!=null) {
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element){
                element.sendKeys(text);
    }
    public static void SingleSelectDD(WebElement element,String selectBy,String input){
        Select type=new Select(element);

        if(selectBy.equalsIgnoreCase("Value")){
            type.selectByValue(input);
        }else if(selectBy.equalsIgnoreCase("VisibleText")){
            type.selectByVisibleText(input);
        }
    }

    public static void SingleSelectDD(WebElement element, int Byindex){
        Select type=new Select(element);
        type.selectByIndex(Byindex);
    }

public static void takeScreenShot(String fileName){

    //declare the instance
    TakesScreenshot ts=(TakesScreenshot) driver;
    //take screenshot as output type FILE
    File screenshot=ts.getScreenshotAs(OutputType.FILE);

    //save it in your computer
    try{
        FileUtils.copyFile(screenshot,new File(fileName));
    }catch(IOException e){
        e.printStackTrace();
    }
}








}
