package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpLoad extends CommonMethods {
    public static void main(String[] args) {

        String URL = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        openBrowserAndLaunchApplication(URL, browser);

        //find the element which you can click to upload the file
       WebElement fileUploadBtn= driver.findElement(By.xpath("//input[@name='file']"));

       //in order to send/upload the file
        //you can send the path of that file in sendKeys
        fileUploadBtn.sendKeys("/Users/axelmoraga/Downloads/Axel Beauty or Truth in Keats (1).pdf");



    }
}
