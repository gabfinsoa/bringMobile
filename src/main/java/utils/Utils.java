package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Utils {

    public AndroidDriver driver;
    public FluentWait wait;

    public Utils(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
                .ignoring(TimeoutException.class);
    }

    public void waitElement(MobileElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement(MobileElement element) {
        waitElement(element);
        element.click();
    }

    public void sendKeys(MobileElement element, String text) {
        waitElement(element);
        element.sendKeys(text);
    }

    public void closeKeyboard() {
        driver.hideKeyboard();
    }

    public void takePicture() {
        driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
        driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
    }

    public String getText(MobileElement element) {
        waitElement(element);
        String getTextReturn = element.getText();

        return getTextReturn;
    }

    public void Swipe() throws InterruptedException {

        WebElement contact = driver.findElement(By.id("makePaymentView"));

        Dimension dimensions = contact.getSize();
        int Anchor = contact.getSize().getHeight() / 2;
        Double screenWidthStart = dimensions.getWidth() * 0.8;
        int scrollStart = screenWidthStart.intValue();
        Double screenWidthEnd = dimensions.getWidth() * 0.6;
        int scrollEnd = screenWidthEnd.intValue();

        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(scrollStart, Anchor))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(scrollEnd, Anchor))
                .release().perform();
        Thread.sleep(3000);
    }

}
