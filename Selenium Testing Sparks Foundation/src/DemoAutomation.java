

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\seleneium full\\selenium-java-3.141.59\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//URL  Opened
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		System.out.println("Test Case 1: Url | Url Opened");
		Thread.sleep(10000);
		
		//Logo Check
		driver.findElement(By.className("navbar-brand"));
		System.out.println("Test Case 2: Logo | Logo Checked");
		Thread.sleep(10000);
		
		//Dropdown Check
		driver.findElement(By.className("caret")).click();
		Thread.sleep(10000);
		driver.findElement(By.className("caret")).click();
		System.out.println("Test Case 3: Dropdown Menu | Dropdown menu Checked");
		Thread.sleep(10000);
		
		//Slides Check
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/section/div/ol/li[2]/a")).click();
		System.out.println("Test Case 4: Slides | Slides Checked");
		Thread.sleep(10000);
		
		//Title Check
		String at = driver.getTitle();
		String et = "The Sparks Foundation | Home";
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test Case 5: Title | Title Checked");
		}
		else
		{
			System.out.println("Test failure");
		}
		Thread.sleep(10000);
		
		//Scroll Check
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 500)");
		Thread.sleep(200);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("scrollBy(0, 500)");
		Thread.sleep(200);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("scrollBy(0, 500)");
		System.out.println("Test Case 6: Scroll | Scroll checked");
		Thread.sleep(10000);
		
		//Link Check
		driver.findElement(By.linkText("TSF NETWORK @ LINKEDIN"));
		System.out.println("Test Case 7: Link | linkedIn Profile link checked");
		Thread.sleep(10000);
		
		//Go Top Button Check
		driver.findElement(By.id("toTop")).click();
		System.out.print("Test Case 8: Gotop | Return Home Page using goTopHover checked");
		Thread.sleep(10000);
		driver.findElement(By.className("caret")).click();
		Thread.sleep(10000);
		
		//Next Page Link Check
		driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/ul/li[1]/a")).click();
		System.out.println("Test Case 9: Next Page | Reach Next Page checked");
		Thread.sleep(10000);
		
		//Heading Check
		String ct = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2")).getText();
		String ut = "Vision, Mission and Values";
		if(ct.equalsIgnoreCase(ut))
		{
			System.out.println("Test Case 10: Heading | Heading Checked");
		}
		else
		{
			System.out.println("Test failure");
		}
		Thread.sleep(10000);
		
		//Navigate Back Check
		driver.navigate().back();
		Thread.sleep(10000);
		
		//Other pages Check
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("scrollBy(0, 4000)");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/ul/li[1]/a")).click();
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		System.out.println("Test Case 11: Other Pages | Reach Other Pages checked");
		
		//Contact Video Check
		driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[6]/a")).click();
		Thread.sleep(10000);
		System.out.println("Test Case 12: Contact Page | Contact Page checked");
		driver.close();
	}


}
