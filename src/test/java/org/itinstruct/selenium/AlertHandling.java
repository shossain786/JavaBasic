package org.itinstruct.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertHandling {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/iTinstruct-1.3.5/home.html");

        driver.findElement(By.xpath("//button[@id='empId01']")).click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("test123");
        Thread.sleep(2000);
        alert.accept();

        System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

        Thread.sleep(2000);

        driver.quit();
    }

    static void handlingAlert() throws InterruptedException {
        //        clicking on the Greetings button
        driver.findElement(By.xpath("//button[.='Greetings!']")).click();
        Thread.sleep(2000);
//        switching to an alert
        Alert alert = driver.switchTo().alert();

        System.out.println("Text fetched from the alert: " + alert.getText());

//        to accept or click on Ok/Yes button
        alert.accept();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='fieldToBeDeleted']")).click();
        Alert alertDeleteBtn = driver.switchTo().alert();
        System.out.println(alertDeleteBtn.getText());
        alertDeleteBtn.dismiss();
        Thread.sleep(2000);
//        handling the second alert
        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        confirmationAlert.accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//button[@id='fieldToBeDeleted']")).isDisplayed());
        Thread.sleep(2000);
    }
}
