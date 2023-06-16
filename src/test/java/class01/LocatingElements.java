package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

//instance
        WebDriver driver=new ChromeDriver();
        //facebook.com
        driver.get("https://facebook.com");
        //maximize the window
        driver.manage().window().maximize();
        //Send some text in the email
        //find the element
        driver.findElement(By.id("email")).sendKeys("moragaaxel@yahoo.com");
        //send some text to the password field
        driver.findElement(By.name("pass")).sendKeys("acckakakakak");

        //print the url on console
       String url= driver.getCurrentUrl();
        System.out.println(url);

        //print the tile on the console
        String title=driver.getTitle();
        System.out.println(title);

        //confirm that the tile is facebook-login or signup
        if(title.equals("Facebook - log in or sign up")){
            System.out.println("The tile is correct");
        }else{
            System.out.println("The title is incorrect");
        }



        //close
        driver.close();







    }
}
