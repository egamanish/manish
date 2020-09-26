package mypack;

//import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase2 {

	
	@Test
	public static void tc3() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",
		            "G:\\Traning selenium\\Selenium\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://apps.qaplanet.in/hrm");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		
		driver.findElement(By.name("Submit")).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("rightMenu");
		
        Select dd = new Select(driver.findElement(By.id("loc_code")));
		
	 	dd.selectByVisibleText("Emp. First Name");
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter FirstName : ");
		//String name = sc.nextLine();
		driver.findElement(By.id("loc_name")).sendKeys("abc");
		
		
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[2]/input[2]")).click();
		
	    WebElement cb = 	driver.findElement(By.className("checkbox"));
	
             for(int i=1; i<2 ; i++) {
		cb.click();
		System.out.println(cb.isSelected());
		Thread.sleep(3000);
		driver.close();
	}
	}
	
	@Test
	public static void tc4() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",
		            "G:\\Traning selenium\\Selenium\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://apps.qaplanet.in/hrm");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		
		driver.findElement(By.name("Submit")).click();
		 
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("rightMenu");
		
        Select dd = new Select(driver.findElement(By.id("loc_code")));
		
		dd.selectByVisibleText("Emp. First Name");
		
		driver.findElement(By.id("loc_name")).sendKeys("abc");
		
		
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[2]/input[2]")).click();
		
	    WebElement cb = 	driver.findElement(By.className("checkbox"));
	
             for(int i=1; i<2 ; i++) {
		cb.click();
		System.out.println(cb.isSelected());
		Thread.sleep(3000);
	}
          driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]")).click();
	      driver.close();
	}
@Test
public static void tc5() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver",
	            "G:\\Traning selenium\\Selenium\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://apps.qaplanet.in/hrm");
	
	WebElement user = driver.findElement(By.className("bodyTXT"));
       
	System.out.println(user.getText());
	
	WebElement password = driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[1]"));
	
	System.out.println(password.getText());
	
	WebElement login = driver.findElement(By.name("Submit"));
	
	if(login.isDisplayed()) {
		System.out.println("login button is displayed");
	}else {
		System.out.println("login button is not displayed");
	}
	
	WebElement clear = driver.findElement(By.className("button"));
	
	if(clear.isDisplayed()) {
		System.out.println("clear button is displayed");
	}else {
		System.out.println("clear button is not displayed");
	}
	
    driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	
	driver.findElement(By.name("Submit")).click();
	
	System.out.println(driver.getTitle());
	
	Thread.sleep(3000);
	

	Actions builder = new Actions(driver);
	WebElement element = driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span"));
	builder.moveToElement(element).build().perform();
	
	Thread.sleep(3000);
	
    WebElement second = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/a/span"));
	builder.moveToElement(second).build().perform();
	
	Thread.sleep(3000);
	
	WebElement location = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/ul/li[2]/a/span"));
	location.click();
	
	driver.switchTo().frame("rightMenu");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("editBtn")).click();
	
	Alert alert = driver.switchTo().alert();
	
	Thread.sleep(3000);
	
	alert.accept();
	
	driver.findElement(By.id("txtLocDescription")).sendKeys("ega");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("editBtn")).click();
	
	Thread.sleep(3000);
	
	alert.accept();
	
	Select dd = new Select(driver.findElement(By.id("cmbCountry")));
	
	Thread.sleep(1000);
	
	dd.selectByVisibleText("India");
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("editBtn")).click();
	
    Thread.sleep(1000);
                                                                                  
	alert.accept();
	
	driver.findElement(By.id("txtAddress")).sendKeys("3-185");
	
	Thread.sleep(1000);
	
    driver.findElement(By.id("editBtn")).click();
	
    Thread.sleep(1000);
	
	alert.accept();
	
    driver.findElement(By.id("txtZIP")).sendKeys("500044");
	
	Thread.sleep(1000);
	
    driver.findElement(By.id("editBtn")).click();
	
	driver.close(); 
}
@Test
public static void tc6() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver",
	            "G:\\Traning selenium\\Selenium\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://apps.qaplanet.in/hrm");
	
	WebElement user = driver.findElement(By.className("bodyTXT"));
       
	System.out.println(user.getText());
	
	WebElement password = driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[1]"));
	
	System.out.println(password.getText());
	
	WebElement login = driver.findElement(By.name("Submit"));
	
	if(login.isDisplayed()) {
		System.out.println("login button is displayed");
	}else {
		System.out.println("login button is not displayed");
	}
	
	WebElement clear = driver.findElement(By.className("button"));
	
	if(clear.isDisplayed()) {
		System.out.println("clear button is displayed");
	}else {
		System.out.println("clear button is not displayed");
	}
	
    driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	
	driver.findElement(By.name("Submit")).click();
	
	System.out.println(driver.getTitle());
	Actions builder = new Actions(driver);
	WebElement element = driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span"));
	builder.moveToElement(element).build().perform();		
    WebElement second = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/a/span"));
	builder.moveToElement(second).build().perform();		
	WebElement location = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/ul/li[2]/a/span"));
	location.click();
	
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
	driver.findElement(By.id("editBtn")).click();
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	driver.findElement(By.id("txtLocDescription")).sendKeys("ega1");
	driver.findElement(By.id("editBtn")).click();
	alert.accept();
	Select dd = new Select(driver.findElement(By.id("cmbCountry")));
	dd.selectByVisibleText("India");
	driver.findElement(By.id("editBtn")).click();                                                               
	alert.accept();
	driver.findElement(By.id("txtAddress")).sendKeys("3-185");
    driver.findElement(By.id("editBtn")).click();
	alert.accept();
    driver.findElement(By.id("txtZIP")).sendKeys("500044");		
    driver.findElement(By.id("editBtn")).click();           
    Select loc = new Select(driver.findElement(By.id("loc_code")));		
	loc.selectByVisibleText("Name");		
	driver.findElement(By.id("loc_name")).sendKeys("ega");		
	driver.findElement(By.className("plainbtn")).click();		
	//WebElement cb = driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr[1]/td[1]/input"));
	WebElement cb = driver.findElement(By.name("allCheck"));
	cb.click();
	System.out.println(cb.isSelected());
	
	Thread.sleep(1000);
	
driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[2]")).click();

Alert alert1 = driver.switchTo().alert();
alert1.accept();
	Thread.sleep(2000);
	
	driver.close(); 

}
};
	
	

