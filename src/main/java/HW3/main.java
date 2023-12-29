package HW3;

import driverFactory.DriverSetUp;
import lesson5.TaskForLesson5;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v117.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.get("https://www.google.com/search");
        Set<String> set1 = driver.getWindowHandles();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#APjFqb"))).click();
        actions.sendKeys("https://www.guinnessworldrecords.com/account/register?").sendKeys(Keys.ENTER).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/div/div/span/a/h3")));
        actions.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/div/div/span/a/h3")))
                .keyUp(Keys.CONTROL)
                .perform();
        Set<String> set2 = driver.getWindowHandles();
        set2.removeAll(set1);
        String handle1 = set2.iterator().next();
        actions.moveToElement(driver.findElement(By.cssSelector("#APjFqb"))).click()
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.DELETE)
                .sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html")
                .sendKeys(Keys.ENTER)
                .build().perform();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rso']/div[1]/div/div/div[1]/div/div/span/a/h3")));
        actions.keyDown(Keys.CONTROL)
                .click(driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div[1]/div/div/span/a/h3")))
                        .keyUp(Keys.CONTROL).build().perform();
        Set<String> set3 = driver.getWindowHandles();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(1))
                                .ignoring(NoSuchElementException.class)
                                        .ignoring(ElementNotInteractableException.class)
                                                .ignoring(InvalidElementStateException.class);
        fluentWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeResult")))
                        .findElement(By.id("fname")).clear();
        actions.moveToElement(driver.findElement(By.id("fname")))
                .click()
                .sendKeys("Dmytro")
                .moveToElement(driver.findElement(By.id("lname")))
                .click()
                .sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE + "Chernetskyi")
                .moveToElement(driver.findElement(By.cssSelector("body > form > input[type=submit]:nth-child(10)")))
                .click()
                .build().perform();
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/p")));
        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/p")).getText());
        driver.switchTo().window(handle1);
        actions.moveToElement(driver.findElement(By.id("LastName")))
                .click()
                .sendKeys("Chernetskyi")
                .moveToElement(driver.findElement(By.id("FirstName")))
                .click()
                .sendKeys("Dmytro")
                .moveToElement(driver.findElement(By.id("DateOfBirthDay")))
                .click()
                .sendKeys("06")
                .click(driver.findElement(By.id("DateOfBirthMonth")))
                .sendKeys("09")
                .click(driver.findElement(By.id("DateOfBirthYear")))
                .sendKeys("1990")
                .build().perform();
        Select countries = new Select(driver.findElement(By.xpath("//*[@id='Country']")));
        countries.selectByVisibleText("Ukraine");

        actions.click(driver.findElement(By.id("State")))
                .sendKeys("Kyiv")
                .click(driver.findElement(By.id("EmailAddress")))
                .sendKeys("someEmail@gmail.com")
                .click(driver.findElement(By.id("ConfirmEmailAddress")))
                .sendKeys("someEmail@gmail.com")
                .click(driver.findElement(By.id("Password")))
                .sendKeys("10101010")
                .click(driver.findElement(By.id("ConfirmPassword")))
                .sendKeys("01010101")
                .sendKeys(Keys.ENTER)
                .build().perform();
        System.out.println(
                driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/div/div/form/section[2]/div[2]/div[2]/span/span")).getText());

        set3.removeAll(set2);
        set3.removeAll(set1);
        String handle2 = set3.iterator().next();
        driver.switchTo().window(handle2);
        actions.click(driver.findElement(By.id("alertBox"))).perform();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        System.out.println(driver.findElement(By.cssSelector("#output")).getText());
        driver.findElement(By.id("confirmBox")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        System.out.println(driver.findElement(By.cssSelector("#output")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/ins[2]/div[1]")).click();
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("promptBox"))).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Final step of this task");
        alert3.accept();
        System.out.println(driver.findElement(By.cssSelector("#output")).getText());
        Thread.sleep(2000);
        driver.quit();


    }
}
