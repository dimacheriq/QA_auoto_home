package hw4.priority;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ActionsClass;

public class Priority1_dependVar {
    static WebDriver driver;
    static ActionsClass actionsClass;
    @Test(dependsOnMethods = {"b"})
    public void a (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(dependsOnMethods = {"c"})
    public void b (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(dependsOnMethods = {"d"})
    public void c (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(dependsOnMethods = {"e"})
    public void d (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(dependsOnMethods = {"f"})
    public void e (){
        driver.get("https://uk.wikipedia.org/");
        actionsClass.click(By.xpath("//*[@id='p-logo']/a"));
        String resultWelcomeText = driver.findElement(By.xpath("//*[@id='Ласкаво_просимо_до_Вікіпедії,']")).getText();
        Assert.assertTrue(resultWelcomeText.contains("Ласкаво просимо до Вікіпедії"), "Equals is not working :(");
    }

    @Test(dependsOnMethods = {"g"})
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
