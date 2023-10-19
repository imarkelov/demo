

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest {
    @BeforeAll
    public void beforeAll() {
        Configuration.baseUrl = "http://demoqa.com";
        Configuration.browser = "CHROME";
        Configuration.browserSize = "1920x1080";
    }
}
