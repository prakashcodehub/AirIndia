package projectAirIndia;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement user = driver.findElement(By.xpath("//p[contains(text(),'Friends I am from Manual testing')]"));
		js.executeScript("arguments[0].scrollIntoView('true')", user);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		WebElement highlight = driver.findElement(By.xpath("//h2[text()='Best Selenium training center in OMR']"));
		js.executeScript("arguments[0].setAttribute('style','background:red;border:soild 2px red');", highlight);	
	}
}
		

	


