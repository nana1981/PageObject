package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class RegistrationSteps extends RegistrationPage {
    public RegistrationPage GoToRegistrationPage (){
        RegistrationBatton.click();
        UserIsOnRegistrationPage.shouldBe(Condition.visible, Duration.ofSeconds(3000));
        return this;
    }
    public RegistrationSteps FillFirstNameInput(String FirstNameValue){
        FirstNameInput.setValue(FirstNameValue);
        return this;
    }
    public RegistrationSteps FillLastNameInput(String LastNameValue){
        LastNameInput.setValue(LastNameValue);
        return this;
    }
    public RegistrationSteps FillPersonalIdInput(String PersonalIdValue){
        PersonalIdInput.setValue(PersonalIdValue);
        return this;
    }
    public  RegistrationSteps FillPhoneNumberInput(String PhoneNumberValue){
        PhoneNumberInput.setValue(PhoneNumberValue);
        return this;
    }
    public RegistrationSteps FillUserNameInput(String UserNameValue){
        UserNameInput.setValue(UserNameValue);
        return this;
    }
    public RegistrationSteps FillPasswordInput(String PasswordValue){
        PasswordInput.setValue(PasswordValue);
        return this;
    }
}
