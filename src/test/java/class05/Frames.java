package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends CommonMethods {
    public static void main(String[] args) {

        String URL="https://chercher.tech/practice/frames";
        String browser="chrome";

        openBrowserAndLaunchApplication(URL,browser);


        //task 1: print baby cat on screen ad select Babycat from drop down

        //  STEP 1: as the webelement is inside an iframe. first we need to switch to it

        driver.switchTo().frame(1);

        //find the webElement animal
     WebElement animal=driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        //select baby cat
      WebElement DD=  driver.findElement(By.xpath("//select[@id='animals']"));

      Select s=new Select(DD);
      s.selectByVisibleText("Baby Cat");

      //switch the focus to the main page
        driver.switchTo().defaultContent();

        //switch to frame containing text box

        driver.switchTo().frame("frame1");

      WebElement textBox=driver.findElement(By.xpath("//input"));
      textBox.sendKeys("abracadabra");

    //click on the checkbox
        //switch to ifram using webElement method
      WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
      driver.switchTo().frame(frame3);

      driver.findElement(By.id("a")).click();

      


    }
}
