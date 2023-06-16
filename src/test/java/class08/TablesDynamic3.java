package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TablesDynamic3 extends CommonMethods {
    public static void main(String[] args) {
        String URL = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";

        openBrowserAndLaunchApplication(URL, browser);

        //Login to the webstie
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        //click on Pim
        WebElement PimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PimBtn.click();

//Get the Id number from another table in a diff page
        boolean found=false;
        while(!found) {
            //Get all the ids from the tables into the list
            List<WebElement> allIds=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            for (int i = 0; i < allIds.size(); i++) {
                String text = allIds.get(i).getText();
                if (text.equals("53481A")) {
                    System.out.println("Click on the check box on row number " + (i + 1));
                    WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkbox.click();
                    //to break the while loop
                    found=true;
                    //to break the for loop
                    break;
                }
            }
            if(!found){
                //click on the next page
               WebElement nextBtn= driver.findElement(By.xpath("//a[text()='Next']"));
               nextBtn.click();


            }


        }










    }
}

