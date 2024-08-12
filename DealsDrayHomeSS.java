package dealsDrayHome;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DealsDrayHomeSS {
	
	
	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com");
		driver.manage().window().maximize();
		
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File soursefile = screenshot.getScreenshotAs(OutputType.FILE);
//		File destfile = new File("C:\\Users\\DELL\\Pictures\\source.png");
//		FileHandler.copy(soursefile,destfile);
		
		Robot robot = new Robot();
		Dimension dimension = new Dimension(1920, 1080);
		java.awt.Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(screensize);
		BufferedImage source= robot.createScreenCapture(rect);
		driver.manage().window().setSize(dimension);
		File destfile = new File("C:\\Users\\DELL\\Pictures\\fullimagesource1920.png");
		ImageIO.write(source, "png", destfile);
		
		driver.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		
		driver.findElement(By.partialLinkText("www.getcalley.com")).click();
		Robot robot1 = new Robot();
		java.awt.Dimension screensize1 = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect1 = new Rectangle(screensize1);
		BufferedImage source1= robot1.createScreenCapture(rect1);
		driver.manage().window().setSize(dimension);
		File destfile1 = new File("C:\\Users\\DELL\\Pictures\\1stlinkSS.png");
		ImageIO.write(source1, "png", destfile1);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("calley-lifetime-offer")).click();
		Robot robot2 = new Robot();
		java.awt.Dimension screensize2 = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect2 = new Rectangle(screensize2);
		BufferedImage source2= robot2.createScreenCapture(rect2);
		driver.manage().window().setSize(dimension);
		File destfile2 = new File("C:\\Users\\DELL\\Pictures\\2ndlinkSS.png");
		ImageIO.write(source2, "png", destfile2);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("see-a-demo")).click();
		Robot robot3 = new Robot();
		java.awt.Dimension screensize3 = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect3 = new Rectangle(screensize3);
		BufferedImage source3= robot3.createScreenCapture(rect3);
		driver.manage().window().setSize(dimension);
		File destfile3 = new File("C:\\Users\\DELL\\Pictures\\3rdlinkSS.png");
		ImageIO.write(source3, "png", destfile3);
		driver.navigate().back();
		
		
		driver.findElement(By.partialLinkText("calley-teams-features")).click();
		Robot robot4 = new Robot();
		Dimension dimension4 = new Dimension(1920, 1080);
		java.awt.Dimension screensize4 = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect4 = new Rectangle(screensize4);
		BufferedImage source4= robot4.createScreenCapture(rect4);
		driver.manage().window().setSize(dimension4);
		File destfile4 = new File("C:\\Users\\DELL\\Pictures\\4thlinkSS.png");
		ImageIO.write(source4, "png", destfile4);
		
		driver.findElement(By.partialLinkText("calley-pro-features")).click();
		Robot robot5 = new Robot();
		Dimension dimension5 = new Dimension(1920, 1080);
		java.awt.Dimension screensize5 = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect5 = new Rectangle(screensize5);
		BufferedImage source5= robot5.createScreenCapture(rect5);
		driver.manage().window().setSize(dimension5);
		File destfile5 = new File("C:\\Users\\DELL\\Pictures\\5thlinkSS.png");
		ImageIO.write(source5, "png", destfile5);
		
		
	}

}
