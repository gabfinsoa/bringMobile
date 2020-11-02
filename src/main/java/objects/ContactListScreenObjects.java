package objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.time.Duration;

public class ContactListScreenObjects extends Utils {

    public ContactListScreenObjects(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(40)),
                this);
    }

    @AndroidFindBy(id = "floating_action_button")
    public MobileElement btnAddNewContact;

    @AndroidFindBy(id = "open_search_bar_text_view")
    public MobileElement edTextSearchContact;

}
