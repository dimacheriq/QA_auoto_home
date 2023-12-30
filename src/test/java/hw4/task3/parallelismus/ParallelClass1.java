package hw4.task3.parallelismus;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ActionsClass;

public class ParallelClass1 {
    @BeforeClass
    public void precondition() {
        driver = DriverSetUp.setUpDriver();
        actionsClass = new ActionsClass(driver);
    }
    static WebDriver driver;
    static ActionsClass actionsClass;
    @Test
    public void parallel1 () throws InterruptedException {
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Thread.sleep(2000);
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @Test
    public void parallel2 () throws InterruptedException {
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Thread.sleep(2000);
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @Test
    public void parallel3 () throws InterruptedException {
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Thread.sleep(2000);
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @Test
    public void parallel4 () throws InterruptedException {
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Thread.sleep(2000);
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @Test
    public void parallel5 () throws InterruptedException {
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Thread.sleep(2000);
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @AfterClass
    public void postConditions() {
        driver.quit();
    }
}
