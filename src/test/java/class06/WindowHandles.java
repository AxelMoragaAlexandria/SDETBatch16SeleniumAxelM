package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;


public class WindowHandles extends CommonMethods {
    public static void main(String[] args) {
        String URL="http://accounts.google.com/signup";
        String browser="chrome";
        openBrowserAndLaunchApplication(URL,browser);

//click on the help button and privacy button
      WebElement helpBtn=driver.findElement(By.linkText("Help"));
      helpBtn.click();

    WebElement privacybtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
    privacybtn.click();

    //get the window handle of the main page and print on console also save it for later use
      String mainPageHandle=driver.getWindowHandle();
        System.out.println("Main page handle is "+mainPageHandle);

        //  get all the window handle and print th titles associated with each window handle on the console COMMENTED OUT

        //get all handles,  switch the focus of the driver to google help page

      Set<String> allHandles=driver.getWindowHandles();

      for(String handle:allHandles){
          driver.switchTo().window(handle);
         String title= driver.getTitle();

        if(title.equalsIgnoreCase("Google Account Help")){
            break;
        }
      // System.out.println("The title associated with "+handle+" is : "+title );
      }

      // when the focus is shifted to correct page
        System.out.println("The current page under focus is : "+driver.getTitle());

      //after switching to the page google account help, we can deal with any element we want to in a regular manner

        //switch my focus back to main page
        driver.switchTo().window(mainPageHandle);

        //check the focus
        System.out.println("The focus is on : "+driver.getTitle());


    }
}
