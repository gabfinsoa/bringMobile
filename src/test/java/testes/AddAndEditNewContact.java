package testes;

import actions.*;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Capabilities;

import java.io.IOException;

public class AddAndEditNewContact {

    AndroidDriver driver;

    @BeforeMethod
    public void setupTeste() {
        Capabilities caps = new Capabilities();
        caps.setAndroidEmulator();
        driver = caps.getDriver();
    }

    @Test
    public void loginHomolog() throws InterruptedException, IOException {

        ContactListScreenActions contactListScreenActions = new ContactListScreenActions(driver);
        NewContactFormScreenActions newContactFormScreenActions = new NewContactFormScreenActions(driver);
        ContactDetailsScreenActions contactDetailsScreenActions = new ContactDetailsScreenActions(driver);

        String nameEdit = "Bring Global";

        contactListScreenActions.doAddNewContactBtnAction();
        newContactFormScreenActions.doTakePicture();
        newContactFormScreenActions.doInputFirstNameAction("Bring");
        newContactFormScreenActions.doInputLastNameAction("Digital");
        newContactFormScreenActions.doInputEmailAction("Sonia.pereira@bringglobal.com");
        newContactFormScreenActions.doEmailTypeSelectAction();
        newContactFormScreenActions.doPhoneTypeSelectAction();
        newContactFormScreenActions.doInputPhoneNumberAction("+351 911111111");
        newContactFormScreenActions.doSaveContact();
        contactDetailsScreenActions.doEditContactBtnAction();
        newContactFormScreenActions.doInputFirstEditNameAction(nameEdit);
        newContactFormScreenActions.doSaveContact();

        Assert.assertEquals(contactDetailsScreenActions.doAssertContactNewNameAction(), nameEdit);

    }

    @AfterMethod
    public void setDownTeste() {
        driver.quit();
    }

}
