package adjarabet;

import StepObject.RegistrationSteps;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.runner;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static dataobject.registrationdata.*;

public class adjaratest extends runner {
    @Test
    public  void registration (){
        $ (byAttribute("data-id","register-btn")).click();
        $ (byText("შექმენი ახალი ანგარიში")).shouldBe(Condition.visible,Duration.ofSeconds(2000));
        Assert.assertTrue($(byText("შექმენი ახალი ანგარიში")).isDisplayed());
        $ (byAttribute("data-id","signUpFormFirstOfThree_firstname")).setValue("nana");
        Assert.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_firstname")).getValue(),"nana");
        $ (byAttribute("data-id","signUpFormFirstOfThree_lastname")).setValue("sachaneli");
        Assert.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_lastname")).getValue(),"sachaneli");
        $ (byText("მდედრობითი")).click();
        Assert.assertTrue($(byText("მდედრობითი")).isEnabled());
        $ (byAttribute("data-id","signUpFormFirstOfThree_country")).click();
        $ (byText("ანგილია")).click();
        Assert.assertTrue($(byText("ანგილია")).isDisplayed());
        $ (byAttribute("data-id","signUpFormFirstOfThree_documentType")).click();
        $ (byText("პირადობის მოწმობა")).click();
        Assert.assertTrue($(byText("პირადობის მოწმობა")).isDisplayed());
        $ (byAttribute("data-id","signUpFormFirstOfThree_personalId")).setValue("01017017640");
        Assert.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_personalId")).getValue(),"01017017640");
        $ (byAttribute("data-id","signUpFormFirstOfThree_phoneNumber")).setValue("555390937");
        Assert.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_phoneNumber")).getValue(),"555390937");
        $ (byAttribute("data-id","signUpFormFirstOfThree_username")).setValue("nana1981");
        Assert.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_username")).getValue(),"nana1981");
        $ (byAttribute("data-id","signUpFormFirstOfThree_password")).setValue("Adjaratest!1");
        Assert.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_password")).getValue(),"Adjaratest!1");
        $ (byText("გაგრძელება"));
        Assert.assertTrue($ (byText("გაგრძელება")).isEnabled());



        sleep(3000);


    }
    @Test
    public void Registration(){
        RegistrationSteps steps = new RegistrationSteps();
        steps.GoToRegistrationPage();
        Assert.assertTrue(steps.UserIsOnRegistrationPage.isDisplayed());
        steps
                .FillFirstNameInput(FirstNameValue)
                .FillLastNameInput(LastNameValue)
                .FillPersonalIdInput(PersonalIdValue)
                .FillPhoneNumberInput(PhoneNumberValue)
                .FillUserNameInput(UserNameValue)
                .FillPasswordInput(PassvordValue);
        Assert.assertEquals(steps.FirstNameInput.getValue(),FirstNameValue);
        Assert.assertEquals(steps.LastNameInput.getValue(),LastNameValue);
        Assert.assertEquals(steps.PasswordInput.getValue(),PersonalIdValue);
        Assert.assertEquals(steps.PhoneNumberInput.getValue(),PhoneNumberValue);
        Assert.assertEquals(steps.UserNameInput.getValue(),UserNameValue);
        Assert.assertEquals(steps.PasswordInput.getValue(),PassvordValue);

    }
}