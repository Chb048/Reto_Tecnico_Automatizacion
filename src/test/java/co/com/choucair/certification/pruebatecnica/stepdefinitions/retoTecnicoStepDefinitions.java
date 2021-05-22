package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.model.retoTecnicoData;
import co.com.choucair.certification.pruebatecnica.questions.Answer;
import co.com.choucair.certification.pruebatecnica.tasks.Fill;
import co.com.choucair.certification.pruebatecnica.tasks.Join;
import co.com.choucair.certification.pruebatecnica.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class retoTecnicoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user wants to register in utest$")
    public void theUserWantsToRegisterInUtest() {
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.thePage(), Join.onThePage());
    }

    @When("^The user fills the form$")
    public void theUserFillsTheForm(List<retoTecnicoData> fact) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.ToRegister(fact.get(0).getStrFirstName(),
                fact.get(0).getStrLastName(),fact.get(0).getStrEmail(),fact.get(0).getStrBirthMonth(),
                fact.get(0).getStrBirthDay(),fact.get(0).getStrBirthYear(),fact.get(0).getStrCity(),
                fact.get(0).getStrPostal(),fact.get(0).getStrCountry(),fact.get(0).getStrYourComputer(),
                fact.get(0).getStrVersion(),fact.get(0).getStrLanguage(),fact.get(0).getStrYourMobil(),
                fact.get(0).getStrModel(),fact.get(0).getStrOperating(),fact.get(0).getStrPassword()));
    }

    @Then("^User completes registration successfully$")
    public void userCompletesRegistrationSuccessfully(List<retoTecnicoData> fact) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(fact.get(0).getStrVerify())));
    }
    }
