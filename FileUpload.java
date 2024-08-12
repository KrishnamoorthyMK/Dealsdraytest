package funTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/form/div[3]/div/button")).click();

		driver.findElement(By.cssSelector("Order")).click();
	}

}
