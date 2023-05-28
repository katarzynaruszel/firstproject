import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UltimateQATest extends PageSetUp {



    @Test
    public void TestOne() {
        WebElement buttonUsingId = driver.findElementById(  "idExample");
        buttonUsingId.click();
    WebElement buttonSuccessText = driver.findElementByClassName( "entry-title");
    assertEquals ("Button success", buttonSuccessText.getText());

    }
@Test
    public void TestTwo() throws InterruptedException {
        WebElement nameTextField = driver.findElementByName("et_pb_contact_name_0");
        nameTextField.sendKeys("Tester");


        WebElement emailTextField = driver.findElementByName("et_pb_contact_email_0");
        emailTextField.sendKeys("tester@tester.com");

        Thread.sleep(3000);

        WebElement emailMeButton = driver.findElementByName("et_builder_submit_button");
        emailMeButton.click();

        Thread.sleep(3000);

        WebElement thanksText =driver.findElementByClassName("et-pb-contact-message");
        assertEquals("Thanks for contacting us", thanksText.getText());
}

}
