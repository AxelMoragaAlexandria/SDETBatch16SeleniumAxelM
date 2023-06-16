package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
//declare the instance
        WebDriver driver=new ChromeDriver();
        //naviate to the HRMS

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //maxime the screen
        driver.manage().window().maximize();

        //find the element username TextBox
      WebElement userNameTextBox=  driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");

        //slow down
        Thread.sleep(2000);
        //after sending the username to the textBox clear the test box JUST FOR PRACTICE WE ARE DELETING IT
        userNameTextBox.clear();

        //sending the username again
        userNameTextBox.sendKeys("Admin");

       WebElement password= driver.findElement(By.name("txtPassword"));
       password.sendKeys("Hum@nhrm123");

       //find the login in button
       WebElement Loginbtn= driver.findElement(By.className("button"));
                Loginbtn.click();

                //get the welcome message
       WebElement message= driver.findElement(By.linkText("Welcome Admin"));
                    String text= message.getText();
                    System.out.println(text);
            //click on recruitment tab
                    driver.findElement(By.partialLinkText("Recru")).click();













    }
}
