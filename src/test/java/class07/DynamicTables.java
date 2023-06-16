package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTables extends CommonMethods {
    public static void main(String[] args) {

        String URL = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";

        openBrowserAndLaunchApplication(URL, browser);


        //Login to the website
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        //click on Pim
        WebElement PimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PimBtn.click();

        //print the row number that has the id 56274A

        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
//        look for 56247A
        for (int i = 0; i < allIDs.size(); i++) {
            String id = allIDs.get(i).getText();
            if (id.equals("562 47A")) {
                System.out.println("the id is on row number " + (i + 1));
            }

        }
    }
}
