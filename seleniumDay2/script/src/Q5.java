import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Q5 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/seleniumDay2/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(" http://www.londonfreelance.org/courses/frames/index.html");
        System.out.println("Number of iframes " + driver.findElements(By.xpath("//frameset")).size());
        driver.switchTo().frame("navbar");
        driver.findElement(By.xpath("//a[text()='Sample content']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("content");

        String header=driver.findElement(By.xpath("//h2")).getText();
//        System.out.println(header);
        if(header.equals("Acid-free paper for the digital age"))
        {
            System.out.println("header validated");
        }
        driver.close();

    }
}
