import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class App {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "lib/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.co.in");
        driver.manage().window().maximize();
        if(driver.getTitle().equals("Google"))System.out.println("URL navigation success");
        else System.out.println("Failed to navigate to url");
        WebElement googleSearchField = driver.findElement(By.cssSelector("input[name='q']"));
        googleSearchField.sendKeys("honda");
        googleSearchField.sendKeys(Keys.ENTER);
        WebElement googleSearchButton = driver.findElement((By.cssSelector("input[data-ved='0ahUKEwiZvvm766btAhXozDgGHSOpD2IQ4dUDCAk']")));
        googleSearchButton.click();
    }
}
