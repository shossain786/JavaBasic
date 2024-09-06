package org.itinstruct.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingToastMessages {
    WebDriver driver;


    @Test
    public void fetchMouseOverMsg() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://qa.itinstruct.com/home.html");

        WebElement element = driver.findElement(By.xpath("//label[.='Hover on below field to see tool-tip text']/following-sibling::span"));
        waitTime(1);
        WebElement element1 = driver.findElement(By.xpath("//b[.='Other Web Fields']"));
//        scroll to a element
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", element1);
        waitTime(3);
//        mouse over
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        System.out.println("Mouse hover done");
        waitTime(1);
//      fetching the text
        String mouseOverText = driver.findElement(By.xpath("//div/div[.='Welcome to Selenium Learning!']")).getText();

        System.out.println("mouse over text: " + mouseOverText);
        waitTime(1);
        driver.quit();
    }
    @Test
    public void fetchToastMsg() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://qa.itinstruct.com/home.html");

        driver.findElement(By.id("inputField")).sendKeys("Hello World!");
        waitTime(1);
        driver.findElement(By.id("showToasterBtn")).click();
        waitTime(1);
        String toastMsg = driver.findElement(By.xpath("//div[@id='toast-container']/div/div")).getText();
        System.out.println("Toast message: " + toastMsg);
        waitTime(1);
        driver.quit();
    }

    public void waitTime(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }}
