package ssk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JayMataDi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.setProperty("webdriver.chrome.driver", "E:/chrome  driver 86/chromedriver_win32 (2)/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", "E:/gecodriver/geckodriver-v0.27.0-win32/geckodriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.phptravels.net");
			driver.manage().window().maximize();
			Thread.sleep(10);
			driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Sign Up') and @href='https://www.phptravels.net/register']")).click();
			Thread.sleep(10);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(new String[]{"swarup"});
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(new String[]{"ks"});
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(new String[]{"1234567890"});
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(new String[]{System.currentTimeMillis()+"@gmail.com"});
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(new String[]{"123456"});
			driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys(new String[]{"123456"});
			WebElement ele1=driver.findElement(By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()", ele1);
			js.executeScript("arguments[0].click();", ele1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
