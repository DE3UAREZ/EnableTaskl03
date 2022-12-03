package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgParallel {

	@org.testng.annotations.Test
	public void CheckingOutOneProduct() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Ahmed");
        driver.findElement(By.id("last-name")).sendKeys("Mohamed");
        driver.findElement(By.id("postal-code")).sendKeys("8000");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.id("back-to-products")).click();

      
        
//        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
//        driver.findElement(By.name("password")).sendKeys("yourPassword");
//        driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[3]")).click();
	}
	@org.testng.annotations.Test
	public void CheckingOutMoreThanOneProduct() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        //Adding Products
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.id("checkout")).click();
        //Entering User Info
        driver.findElement(By.id("first-name")).sendKeys("Ahmed");
        driver.findElement(By.id("last-name")).sendKeys("Mohamed");
        driver.findElement(By.id("postal-code")).sendKeys("8000");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        //Back to Main Page
        driver.findElement(By.id("back-to-products")).click();

	}
	
	@org.testng.annotations.Test
	public void EditingCartBeforeCheckOut() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        //Adding Products
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        driver.findElement(By.id("checkout")).click();
        //Entering User Info
        driver.findElement(By.id("first-name")).sendKeys("Ahmed");
        driver.findElement(By.id("last-name")).sendKeys("Mohamed");
        driver.findElement(By.id("postal-code")).sendKeys("8000");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        //Back to Main Page
        driver.findElement(By.id("back-to-products")).click();
	}
}
