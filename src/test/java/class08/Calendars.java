package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Calendars extends CommonMethods {
    public static void main(String[] args) {

        String URL = "https://www.aa.com/homePage.do?locale=en_US";
        String browser = "chrome";

        openBrowserAndLaunchApplication(URL, browser);

        //click on the calander
    WebElement calender= driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
    calender.click();
//Select the data August,4 2023


     boolean monthFound=false;
     while(!monthFound) {
         //get the month and check if it is the desired one
         WebElement month= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
         String currentMonth=month.getText();
         if (currentMonth.equals("August")) {
             System.out.println("Your are on the right month");
         List<WebElement> allDates=driver.findElements(By.xpath("//table/tbody/tr/td"));
         for(WebElement a:allDates){
            String date= a.getText();
            if(date.equals("4")){
                a.click();
            }
         }
             monthFound=true;
         } else {
             //click next
        WebElement nextBtn= driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
        nextBtn.click();
         }
     }





    }
}
