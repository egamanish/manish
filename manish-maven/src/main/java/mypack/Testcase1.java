package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcase1 {
	
@Test
public static void verifylogin() {
    System.setProperty("webdriver.chrome.driver",
            "G:\\Traning selenium\\Selenium\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://apps.qaplanet.in/hrm"); 
	
	//driver.manage().window().maximize();
	
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	
	driver.findElement(By.name("Submit")).click();
	
	
String	acttitle = "OrangeHRM";

String exptitle = driver.getTitle();

if(acttitle.equals(exptitle)) {
	System.out.println("true");
}else {
	System.out.println("false");
}
	


	driver.findElement(By.linkText("Logout")).click();
	
	driver.close();
		}
@Test
public static void addemp() {
	 System.setProperty("webdriver.chrome.driver",
	            "G:\\Traning selenium\\Selenium\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://apps.qaplanet.in/hrm");       
	
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	
	driver.findElement(By.xpath("//*[@value='Login']")).click();
	driver.manage().window().maximize();
	
	String firstName = "Ega";
	String lastName = "Manish";
	
	driver.switchTo().frame("rightMenu");
	
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
	driver.findElement(By.name("txtEmpFirstName")).sendKeys(firstName);
	driver.findElement(By.name("txtEmpLastName")).sendKeys(lastName);
	driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"btnEditPers\"]")).click();
	
	String fn = driver.findElement(By.xpath("//*[@id='txtEmpFirstName']")).getAttribute("value");
	String ln = driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).getAttribute("value");
	
	System.out.println("FirstName :"+ fn);
	System.out.println("LastName :"+ ln);
	
	if(fn.equals(firstName)&&(ln.equals(lastName))) {
		System.out.println("Employee Added Success : Test Case Passed");
	}else {
		System.out.println("Employee Added Failed : Test Case Failed");
	}
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("html/body/div[3]/ul/li[3]/a")).click();
	driver.close();
		}
@Test
public static void mouseover() {
	 System.setProperty("webdriver.chrome.driver",
	            "G:\\Traning selenium\\Selenium\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.get("http://apps.qaplanet.in/hrm");       

driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");

driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");

driver.findElement(By.xpath("//*[@value='Login']")).click();

Actions builder = new Actions(driver);
WebElement element = driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span"));
builder.moveToElement(element).build().perform();

WebElement second = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[3]/a/span"));
builder.moveToElement(second).build().perform();

WebElement third = driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[3]/ul/li[1]/a/span"));
third.click();
driver.close();
}
}


