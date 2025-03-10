package teme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EmagTest {
    public WebDriver driver;

    @Test
    public void metodaTest() {
        driver=new EdgeDriver();
        driver.get("https://www.emag.ro/?msockid=2a46da16945b60e7305bcf1c95d0619e");
        driver.manage().window().maximize();
    }
}
