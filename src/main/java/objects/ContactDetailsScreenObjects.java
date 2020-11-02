package objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.time.Duration;

public class ContactDetailsScreenObjects extends Utils {

    public ContactDetailsScreenObjects(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(40)),
                this);
    }

    @AndroidFindBy(id = "floating_action_button")
    public MobileElement btnEditContact;

    @AndroidFindBy(id = "large_title")
    public MobileElement txtViewNameContactDetails;

}
