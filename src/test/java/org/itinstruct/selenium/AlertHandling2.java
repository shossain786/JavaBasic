package org.itinstruct.selenium;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHandling2 {
    WebDriver driver;
    @Test
    public void handlingAlert2() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/iTinstruct-1.3.5/home.html");

        driver.findElement(By.xpath("//button[@id='empId01']")).click();

        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Emp001");
        Thread.sleep(2000);
        alert.accept();

        Thread.sleep(2000);

        String text = driver.findElement(By.xpath("//div[@id='output']")).getText();
        System.out.println(text);

        driver.quit();
    }


    @Test
    public void handlingAlert2_1() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/iTinstruct-1.3.5/home.html");
        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("Emp001");
            Thread.sleep(2000);
            alert.accept();
        } catch (NoAlertPresentException noAlertPresentException) {
            System.out.println("Alert is not present");
        }

        Thread.sleep(2000);

        driver.quit();
    }

    @Test
    public void handlingAlert2_2() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/iTinstruct-1.3.5/home.html");
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        alert.sendKeys("Emp001");

        Thread.sleep(2000);

        driver.quit();
    }

    @Test
    public void handlingAlert2_3() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/iTinstruct-1.3.5/home.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.findElement(By.xpath("//button[@id='empId01']")).click();
// Handling dynamic wait time for an alert to be present in the ui
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Emp001");
        Thread.sleep(2000);
        alert.accept();

        Thread.sleep(2000);

        String text = driver.findElement(By.xpath("//div[@id='output']")).getText();
        System.out.println(text);

        driver.quit();
    }

    @Test
    public void handlingAlert2_4() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/iTinstruct-1.3.5/home.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.findElement(By.xpath("//button[@id='empId01']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='inputField']")).sendKeys("Test123");

        driver.quit();
    }
}
