package org.itinstruct.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/iTinstruct-1.3.5/home.html");
        driver.findElement(By.xpath("//button[@id='new_win_btn']")).click();

        String mainWindow = driver.getWindowHandle();
        System.out.println("Main window: " + mainWindow);

        Set<String> windows = driver.getWindowHandles();

        System.out.println("Number of windows: " + windows.size());

        windows.remove(mainWindow);
//        fetching the id/name of the new window
        String newWindow = windows.iterator().next();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().window("windowid");

        driver.switchTo().window(newWindow);

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("FistName Test");
        Thread.sleep(2000);

        driver.close(); // it will close the currently focused window

        driver.switchTo().window(mainWindow); //switching back to main window

        driver.findElement(By.xpath("//input[@id='inputField']")).sendKeys("Selenium");

        Thread.sleep(3000);
        driver.quit(); // it close all the browser windows opened by the driver
    }
}
