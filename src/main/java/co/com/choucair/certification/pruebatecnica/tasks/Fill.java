package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.Form;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class Fill implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strCity;
    private String strPostal;
    private String strCountry;
    private String strYourComputer;
    private String strVersion;
    private String strLanguage;
    private String strYourMobil;
    private String strModel;
    private String strOperating;
    private String strPassword;

    public Fill(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strCity, String strPostal, String strCountry, String strYourComputer, String strVersion, String strLanguage, String strYourMobil, String strModel, String strOperating, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strCity = strCity;
        this.strPostal = strPostal;
        this.strCountry = strCountry;
        this.strYourComputer = strYourComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strYourMobil = strYourMobil;
        this.strModel = strModel;
        this.strOperating = strOperating;
        this.strPassword = strPassword;
    }

    public static Fill ToRegister(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strCity, String strPostal, String strCountry, String strYourComputer, String strVersion, String strLanguage, String strYourMobil, String strModel, String strOperating, String strPassword) {
        return Tasks.instrumented(Fill.class, strFirstName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear, strCity, strPostal, strCountry, strYourComputer, strVersion, strLanguage, strYourMobil, strModel, strOperating, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(strFirstName).into(Form.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(Form.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(Form.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(Form.INPUT_BIRTHMONT),
                SelectFromOptions.byVisibleText(strBirthDay).from(Form.INPUT_BIRTHDAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(Form.INPUT_BIRTHYEAR),
                Click.on(Form.BUTTON_NEXT),
                Enter.theValue(strCity).into(Form.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(Form.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(Form.INPUT_CITY),
                Hit.the(Keys.ENTER).into(Form.INPUT_CITY),
                Enter.theValue(strPostal).into(Form.INPUT_POSTAL),
                Click.on(Form.PUSH_COUNTRY),
                Enter.theValue(strCountry).into(Form.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(Form.INPUT_COUNTRY),
                Click.on(Form.BUTTON_NEXT2),
                Click.on(Form.PUSH_COMPUTER),
                Enter.theValue(strYourComputer).into(Form.INPUT_YOURCOMPUTER),
                Hit.the(Keys.ENTER).into(Form.INPUT_YOURCOMPUTER),
                Click.on(Form.PUSH_VERSION),
                Enter.theValue(strVersion).into(Form.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(Form.INPUT_VERSION),
                Click.on(Form.PUSH_LANGUAGE),
                Enter.theValue(strLanguage).into(Form.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(Form.INPUT_LANGUAGE),
                Click.on(Form.PUSH_MOBIL),
                Enter.theValue(strYourMobil).into(Form.INPUT_YOURMOBIL),
                Hit.the(Keys.ENTER).into(Form.INPUT_YOURMOBIL),
                Click.on(Form.PUSH_MODEL),
                Enter.theValue(strModel).into(Form.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(Form.INPUT_MODEL),
                Click.on(Form.PUSH_OPERATING),
                Enter.theValue(strOperating).into(Form.INPUT_OPERATING),
                Hit.the(Keys.ENTER).into(Form.INPUT_OPERATING),
                Click.on(Form.BUTTON_NEXT3),
                Enter.theValue(strPassword).into(Form.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(Form.INPUT_CONFIRMPASSWORD),
                Click.on(Form.SELECT_TERMS),
                Click.on(Form.SELECT_POLICY),
                Click.on(Form.BUTTON_FINAL)
        );
    }
}
