package HW2;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static java.lang.String.valueOf;
//body>svg>text  body>svg>circle:nth-child(4)

public class Task2 {
    public static int coordinateXr (WebElement element){
        return element.getLocation().x + element.getSize().width;
    }
    public static int coordinateXl (WebElement element){
        return element.getLocation().x - element.getSize().width;
    }
    public static int coordinateYh (WebElement element){
        return element.getLocation().y - element.getSize().height;
    }
    public static int coordinateYd (WebElement element) {
        return element.getLocation().y + element.getSize().height;
    }
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.setUpDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(7000);
        Actions actions = new Actions(driver);
        Thread.sleep(1500);

       actions.moveToElement(driver.findElement(By.cssSelector("body>svg>circle:nth-child(7)")))
               .clickAndHold()
               .pause(Duration.ofSeconds(2))
               .moveToLocation(coordinateXr(driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)")))
               ,coordinateYd(driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)"))))
               .pause(Duration.ofSeconds(4))
               .release()
               .pause(Duration.ofSeconds(4))
               .build().perform();
       actions.clickAndHold(driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)")))
               .pause(Duration.ofSeconds(2))
               .moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)")))
               .pause(Duration.ofSeconds(4))
               .release()
               .pause(Duration.ofSeconds(4))
               .build().perform();
       actions.pause(Duration.ofSeconds(2))
               .clickAndHold(driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)")))
               .pause(Duration.ofSeconds(2))
               .moveToElement(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)")))
               .pause(Duration.ofSeconds(4))
               .release()
               .pause(Duration.ofSeconds(4))
               .build().perform();
       actions.pause(Duration.ofSeconds(2))
               .clickAndHold(driver.findElement(By.cssSelector("body > svg > circle:nth-child(7)")))
               .pause(Duration.ofSeconds(1))
               .moveToLocation(coordinateXl(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)")))
               ,coordinateYh(driver.findElement(By.cssSelector("body > svg > circle:nth-child(4)"))))
               .pause(Duration.ofSeconds(4))
               .release().pause(Duration.ofSeconds(4))
               .build().perform();
       actions.pause(Duration.ofSeconds(5))
               .clickAndHold(driver.findElement(By.cssSelector("body>svg>circle:nth-child(7)")))
               .pause(Duration.ofSeconds(1))
               .moveToLocation(coordinateXr(driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)")))
                       ,coordinateYd(driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)"))))
               .pause(Duration.ofSeconds(2))
               .release()
               .pause(Duration.ofSeconds(3))
               .build().perform();
        actions.pause(Duration.ofSeconds(3)).perform();

        actions.dragAndDrop(driver.findElement(By.cssSelector("body>svg>circle:nth-child(7)")),
                driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)"))).pause(Duration.ofSeconds(3)).
                build().perform();

        actions.pause(Duration.ofSeconds(3)).perform();
       actions.dragAndDrop(driver.findElement(By.cssSelector("body > svg > circle:nth-child(6)"))
                       ,driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)")))
               .pause(Duration.ofSeconds(1)).build().perform();

        actions.pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.id("postcard-continue-button")))
                .pause(Duration.ofSeconds(2))
                .click()
                        .pause(Duration.ofSeconds(1))
                .perform();
        actions.pause(Duration.ofSeconds(3)).perform();
        actions.clickAndHold(driver.findElement(By.cssSelector("body > svg > circle:nth-child(6)")))
                        .moveToLocation(coordinateXl(driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)")))
                        ,coordinateYd((driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)")))))
                .pause(Duration.ofSeconds(1))
                .release()
                .pause(Duration.ofSeconds(1)).build().perform();
        actions.pause(Duration.ofSeconds(3)).perform();
        actions.clickAndHold(driver.findElement(By.cssSelector("body > svg > circle:nth-child(6)")))
                .moveToLocation(coordinateXl(driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)")))
                        ,coordinateYd((driver.findElement(By.cssSelector("body>svg>circle:nth-child(4)")))))
                .pause(Duration.ofSeconds(1))
                .release()
                .pause(Duration.ofSeconds(1)).build().perform();
         driver.quit();
    }
}
