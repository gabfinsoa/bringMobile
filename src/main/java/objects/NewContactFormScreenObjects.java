package objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.time.Duration;

public class NewContactFormScreenObjects extends Utils {

    public NewContactFormScreenObjects(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(8)),
                this);
    }

    @AndroidFindBy(id = "photo_icon")
    public MobileElement btnTakePicture;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Concluído')]")
    public MobileElement btnPictureConfirm;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Nome')]")
    public MobileElement edTextFirstName;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Bring')]")
    public MobileElement edTextFirstEditName;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Sobrenome')]")
    public MobileElement edTextLastName;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Telefone')]")
    public MobileElement edTextPhoneNumber;

    @AndroidFindBy(xpath = "//android.widget.Spinner[@content-desc='Celular Telefone']")
    public MobileElement btnPhoneNumberTypeSelect;

    //  Aqui foi utilizado o Phone Number novamente porque o Type "Other" não foi possível capturar
    //  E como ele estava sob o campo Phone, clicando no Phone o Other foi capturado
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'+351 911111111')]")
    public MobileElement listPhoneNumberTypeSelect;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'E-mail')]")
    public MobileElement edTextEmail;

    @AndroidFindBy(xpath = "//android.widget.Spinner[@content-desc='Casa E-mail']")
    public MobileElement btnEmailTypeSelect;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Tirar foto')]")
    public MobileElement btnMakePhoto;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Fotos')]")
    public MobileElement selectPhotoPath;

    @AndroidFindBy(id = "menu_save")
    public MobileElement btnSaveContact;

}
