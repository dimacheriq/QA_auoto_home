package hw4.priority;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ActionsClass;

public class Priority1 {
    static WebDriver driver;
    static ActionsClass actionsClass;
    @Test(priority = 6)
    public void a (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(priority = 5)
    public void b (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(priority = 4)
    public void c (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(priority = 3)
    public void d (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(priority = 2)
    public void e (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(priority = 1)
    public void f (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test
    public void g (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @BeforeClass
    public void precondition() {
        driver = DriverSetUp.setUpDriver();
        actionsClass = new ActionsClass(driver);
    }

    @AfterClass
    public void postConditions() {
        driver.quit();
    }
}
