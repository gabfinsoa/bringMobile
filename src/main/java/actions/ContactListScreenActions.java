package actions;

import io.appium.java_client.android.AndroidDriver;
import objects.ContactListScreenObjects;

public class ContactListScreenActions extends ContactListScreenObjects {

    public ContactListScreenActions(AndroidDriver driver) {
        super(driver);
    }

    public void doAddNewContactBtnAction() {
        clickElement(btnAddNewContact);
    }

    public void doSearchContactBtnAction(String newName) {
        waitElement(edTextSearchContact);
        sendKeys(edTextSearchContact, newName);
    }
}
