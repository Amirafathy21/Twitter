
package submission.tests;
import com.shaft.driver.SHAFT;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import io.qameta.allure.Epic;


@Epic("Web GUI")

public class submissionTest {
    private SHAFT.GUI.WebDriver driver;


    @BeforeClass
    public void beforeClass() throws InterruptedException {
        driver = new SHAFT.GUI.WebDriver() ;
        driver.browser().navigateToURL("https://twitter.com/i/flow/login");
        String userName = "@amirafa55295722";
        String pass = "Ami12Fathy1999";

        //enter username


        driver.element().type(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/d" +
                "iv[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input"),userName);
        //click next
        driver.element().click(By.xpath("//div[@class=\"css-901oao r-1awozwy r-6koalj r-18u3" +
                "7iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0\"]"));
        //enter password
        driver.element().type(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[" +
                "2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input"), pass);
        //click on login
        driver.element().click(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2" +
                "]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div"));
        Thread.sleep(500);

    }


    @Test(description = "send tweet of maximum 280 char")
    public void tweetMaxChar() {
        String text = "test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/t" +
                "test/test/test/test/test/test/test/test/test/test/test/test/test/test/tes" +
                "t/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/tes" +
                "t/test/test/test/test/test/test/test/";

        driver.element().click(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[1]/div[3]/a/div"));

        driver.element().type(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]" +
                "/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/label/div[1]/div/div/div/div/div/div[2]/div/div/div/div"),text);

    driver.element().click(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/d" +
            "iv/div/div/div[2]/div[2]/div/div/div[2]/div[4]/div/span/span"));


    }

    @Test(description = "repeating the same tweet")
    public void sameTweet() {
        String text = "test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/t" +
                "test/test/test/test/test/test/test/test/test/test/test/test/test/test/tes" +
                "t/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/test/tes" +
                "t/test/test/test/test/test/test/test/";

        driver.element().click(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[1]/div[3]/a/div"));

        driver.element().type(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]" +
                "/div/div/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/label/div[1]/div/div/div/div/div/div[2]/div/div/div/div"),text);

        driver.element().click(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/d" +
                "iv/div/div/div[2]/div[2]/div/div/div[2]/div[4]/div/span/span"));
 driver.assertThat().element(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/di" +
                 "v/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div/div/div/div/span")).text()
         .contains("Whoops! You already said that.").perform();

    }


    @Test(description = "send tweet wih GIF")
    public void AddGif() {
        //post
        driver.element().click(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[1]/div[3]/a/div"));
        //GIF icon
        driver.element().click(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div" +
                "[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div"));

        driver.element().click(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div" +
                "/div/div[2]/div[2]/div[1]/div[1]/img"));
        driver.element().click(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div" +
                "/div/div[3]/div/div[1]/div/div[2]/div/img"));
        //POST
        driver.element().click(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div[2]/div[1]/d" +
                "iv/div/div/div[2]/div[2]/div/div/div[2]/div[4]/div/span/span"));

    }

    @AfterClass
    public void close() {

      driver.quit();
    }


}

