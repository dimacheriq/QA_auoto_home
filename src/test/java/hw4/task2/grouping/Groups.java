package hw4.task2.grouping;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.ActionsClass;

public class Groups {
    @BeforeClass(groups = {"first", "second"})
    public void precondition() {
        driver = DriverSetUp.setUpDriver();
        actionsClass = new ActionsClass(driver);
    }
    static WebDriver driver;
    static ActionsClass actionsClass;
    @Test(groups = {"first"})
    public void one (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(groups = {"second"},dependsOnGroups = "first")
    public void two (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @Test(groups = {"first"}, priority = 1)
    public void three (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @Test(groups = {"second"},dependsOnGroups = "first",priority = 1)
    public void four (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @Test(groups = {"first"},priority = 2)
    public void five (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @Test(groups = {"second"},dependsOnGroups = "first",priority = 2)
    public void six (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @Test(groups = {"first"},priority = 3)
    public void seven (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }
    @Test(groups = {"second"},dependsOnGroups = "first",priority = 3)
    public void eight (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @AfterClass(groups = {"first", "second"})
    public void postConditions() {
        driver.quit();
    }
}
