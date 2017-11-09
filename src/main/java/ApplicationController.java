import org.openqa.selenium.WebDriver;
import sun.security.ssl.HandshakeOutStream;


public class ApplicationController {

    private WebDriver driver;
    private HomePage homePage;
    /**
     * Created by sumandas.
     */


    public ApplicationController(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage(){
        if(homePage==null){
            homePage = new HomePage(driver);
        }
        return homePage;
    }
}
