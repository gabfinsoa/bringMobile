package actions;

import io.appium.java_client.android.AndroidDriver;
import objects.NewContactFormScreenObjects;

import java.io.IOException;

public class NewContactFormScreenActions extends NewContactFormScreenObjects {

    public NewContactFormScreenActions(AndroidDriver driver) {
        super(driver);
    }

    public void doInputFirstNameAction(String name) {
        waitElement(edTextFirstName);
        sendKeys(edTextFirstName, name);
    }

    public void doInputLastNameAction(String lastName) {
        waitElement(edTextLastName);
        sendKeys(edTextLastName, lastName);
    }

    public void doInputPhoneNumberAction(String phoneNumber) {
        waitElement(edTextPhoneNumber);
        sendKeys(edTextPhoneNumber, phoneNumber);
    }

    public void doPhoneTypeSelectAction() {
        waitElement(btnPhoneNumberTypeSelect);
        clickElement(btnPhoneNumberTypeSelect);
        waitElement(edTextPhoneNumber);
        clickElement(edTextPhoneNumber);
        closeKeyboard();
    }

    public void doEmailTypeSelectAction() {
        waitElement(btnEmailTypeSelect);
        clickElement(btnEmailTypeSelect);
        waitElement(btnPhoneNumberTypeSelect);
        clickElement(btnPhoneNumberTypeSelect);
        closeKeyboard();
    }

    public void doInputEmailAction(String email) {
        waitElement(edTextEmail);
        sendKeys(edTextEmail, email);
    }

    public void doTakePicture() throws IOException {
//        driver.pushFile("sdcard\\Download", new File("src\\photo\\bring_contact.jpg"));
        waitElement(btnTakePicture);
        clickElement(btnTakePicture);
        waitElement(btnMakePhoto);
        clickElement(btnMakePhoto);
        takePicture();
        waitElement(btnPictureConfirm);
        clickElement(btnPictureConfirm);
    }

    public void doSaveContact() {
        waitElement(btnSaveContact);
        clickElement(btnSaveContact);
    }

    public void doInputFirstEditNameAction(String name) {
        waitElement(edTextFirstEditName);
        sendKeys(edTextFirstEditName, name);
    }

}
