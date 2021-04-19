package halithgit.github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class gittest {
	public WebDriver driver;
	@BeforeSuite
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Halith\\chromedriver.exe");
	 driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
	}
	@Test
	public void singin() {
		WebElement username=driver.findElement(By.id("identifierId"));
		username.sendKeys("halith@aciesglobal.com");
		WebElement nxtbtn= driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));
		nxtbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("12345687");
		WebElement btn= driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));
		btn.click();
		driver.close();
	}

}
