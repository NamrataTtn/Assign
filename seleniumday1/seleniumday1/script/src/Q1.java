import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/seleniumday1/driver/geckodriver");
        WebDriver dr =new FirefoxDriver();
        dr.get("https://www.google.com/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dr.close();

    }
}
