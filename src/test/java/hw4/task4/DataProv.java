package hw4.task4;

import driverFactory.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ActionsClass;

public class DataProv {
        static WebDriver driver;
        static ActionsClass actionsClass;

        @BeforeClass
        public void precondition() {
            driver = DriverSetUp.setUpDriver();
            actionsClass = new ActionsClass(driver);
        }

        @AfterClass
        public void postConditions() {
            driver.quit();
        }


        @Test(dataProvider = "searchParameters")
        public void searchTest(String search) throws InterruptedException {
            driver.get("https://www.foxtrot.com.ua");
            Thread.sleep(2000);
            driver.navigate().refresh();
            actionsClass.sendKeys(By.xpath("//*[@id='js-fix-header']/div/div/div[2]/input[1]"),search);
            Thread.sleep(1500);
            actionsClass.click(By.xpath("//*[@id='js-fix-header']/div/div/div[2]/input[2]"));
            if (true)Assert.assertTrue(driver.findElement(By.xpath("//*[@id='search-page-container']/div[2]/div/div/h1")).getText().contains(search));
        else {driver.findElement(By.xpath("//*[@id='search-page-container']/div[3]/div/div/div/div/div/div[1]/div[1]/label"));}
                     }
      @DataProvider(name = "searchParameters")
        public Object[][] createData() {
            return new Object[][]{
                    {"car"},{"ejbfhiqeuf273657"},
                            {"input"},
                                    {"sense"}
            };
        }
}


