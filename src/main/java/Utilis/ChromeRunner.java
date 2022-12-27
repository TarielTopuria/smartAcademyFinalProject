package Utilis;
import Elements.Elements;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class ChromeRunner extends Elements {
    @BeforeTest
    public static void chromeSetUp(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Selenide.open(BASEURL);
    }
}
