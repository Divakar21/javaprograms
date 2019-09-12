package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch2 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\eclipse\\Divakar\\GreenTech\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement a = driver.findElement(By.xpath("//*[@id='a-autoid-0-announce']"));
		a.click();
		WebElement b = driver.findElement(By.xpath("//*[@id='createAccountSubmit']"));
		b.click();
		WebElement c = driver.findElement(By.name("customerName"));
		c.sendKeys("Divakar");
		WebElement d = driver.findElement(By.id("ap_phone_number"));
		d.sendKeys("9791148956");
		WebElement e = driver.findElement(By.id("ap_email"));
		e.sendKeys("divakarganesh21@gmail.com");
		WebElement f = driver.findElement(By.name("password"));
		f.sendKeys("fonature@123");
		WebElement g = driver.findElement(By.xpath("//input[@type='submit']"));
		g.click();
		driver.close();
	}
}



