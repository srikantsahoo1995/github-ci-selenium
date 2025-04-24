

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class GitCISelenium {

    @Test
    public void testBody() throws InterruptedException {

        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);

        System.out.println(driver.getTitle());

        driver.quit();


    }
}
