package actions;

import io.appium.java_client.android.AndroidDriver;
import objects.ContactDetailsScreenObjects;

public class ContactDetailsScreenActions extends ContactDetailsScreenObjects {

    public ContactDetailsScreenActions(AndroidDriver driver) {
        super(driver);
    }

    public void doEditContactBtnAction() {
        waitElement(btnEditContact);
        clickElement(btnEditContact);
    }

    public String doAssertContactNewNameAction() {
        waitElement(txtViewNameContactDetails);
        String newName = getText(txtViewNameContactDetails);

        return newName;
    }

}
