package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
            RegistrationBatton = $ (byAttribute("data-id","signUpFormFirstOfThree_firstname")),
            FirstNameInput = $ (byAttribute("data-id","signUpFormFirstOfThree_lastname")),
            LastNameInput = $ (byAttribute("data-id","signUpFormFirstOfThree_lastname")),
            PersonalIdInput = $ (byAttribute("data-id","signUpFormFirstOfThree_personalId")),
            PhoneNumberInput = $ (byAttribute("data-id","signUpFormFirstOfThree_phoneNumber")),
            UserNameInput = $ (byAttribute("data-id","signUpFormFirstOfThree_username")),
            PasswordInput = $ (byAttribute("data-id","signUpFormFirstOfThree_password")),
            UserIsOnRegistrationPage = $ (byText("შექმენი ახალი ანგარიში"));
}
