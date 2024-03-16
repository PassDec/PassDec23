package Seleniummethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class LaunchUrl {
	
	public static void main(String args[]) throws InterruptedException, IOException {
		
		System.setProperty("Webdriver.Edge.driver","\\Drivers\\msedgedriver.exe");
		
		//EdgeOptions op = new EdgeOptions(); /// brower object create
		WebDriver driver = new EdgeDriver();
		
driver.manage().window().maximize();
	    
		driver.get("https://www.amazon.in/");
	     Thread.sleep(2000);
	     
        takeScreenshot("Amazon_HomePage");  
        JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("scroll(0,800)");
		takeScreenshot("Amazon_HomePage1");
		Thread.sleep(5000);
	     driver.quit();
	   
	  }
	public static void takeScreenshot(String filename) throws IOException {    
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des = new File ("D:\\ECLIPSE- 2021\\eclipse_workplace_2021-3\\MarchBGANG\\SepSeleniumProject\\src\\seleneumPacakge\\ALLScreenshots\\"
		+filename+".png");
	
		FileHandler.copy(src, des);
		

	}

}
