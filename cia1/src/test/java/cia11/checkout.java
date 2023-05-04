package cia11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class checkout
{
    public static void main( String[] args ) throws InterruptedException
    {
    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.amazon.in/Amazfit-Display-Bluetooth-Accurate-Tracking/dp/B0BBFVW21Z/ref=sr_1_2_sspa?crid=1PF8NFOUEA0NA&keywords=amazfit+smart+watch&qid=1683192887&sprefix=am%2Caps%2C561&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String thetitle = "Amazfit GTS 4 Smart Watch with 1.75” AMOLED Display, Bluetooth Calling, Alexa Built-in, SpO2, Accurate GPS Tracking Fitness Sports Watch with 150 Sports Modes, 8-Day Battery Life (Rosebud Pink)";
        System.out.println(title);
        if(title.equals(thetitle)) {
        	System.out.println("It is matching");
        }
        else {
        	System.out.println("It is not matching");
        }
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000); 
        Boolean back = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).isDisplayed();
        System.out.println("Is item added to cart:" + back);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        Thread.sleep(2000);
        String rt = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
        String extext = "Your Amazon Cart is empty.";
        if(rt.equals(extext)) {
        	System.out.println("Product is removed");
        }
        driver.get("https://www.amazon.in/Amazfit-Display-Bluetooth-Accurate-Tracking/dp/B0BBFVW21Z/ref=sr_1_2_sspa?crid=1PF8NFOUEA0NA&keywords=amazfit+smart+watch&qid=1683192887&sprefix=am%2Caps%2C561&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input ")).click();
        Thread.sleep(1000);
        String sign = driver.getTitle();
        System.out.println(sign);
        String esign = "Amazon Sign In";
        
        if(sign.equals(esign)) {
        	System.out.println("passed");
        }
        else {
        	System.out.println("Failed");
        }

}}