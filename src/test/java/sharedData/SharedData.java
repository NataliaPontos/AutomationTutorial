package sharedData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {
    //Aceasta clasa are ca rol sa deschida/inchida un browser
    //Vom face acest lucru folosind adnotari de TestNg
    public WebDriver driver;

    @BeforeMethod
    public void preparingEnvironmrnt() {
        driver = new EdgeDriver();
        //accesam o pagina web
        driver.get("https://demoqa.com/");
        //facem browserul in modul maximaze
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void clearEnvironment(){
        driver.quit();
    }
}
