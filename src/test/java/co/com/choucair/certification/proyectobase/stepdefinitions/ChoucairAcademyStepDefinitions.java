package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.*;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.mockito.stubbing.*;

import java.util.*;

import static co.com.choucair.certification.proyectobase.questions.Answer.toThe;


public class ChoucairAcademyStepDefinitions {


        private String course;

        @Before
            public void setStage () { OnStage.setTheStage(new OnlineCast());
            }

            @Given("^than ana wants to learn automation at the academy choucair$")
            public void thanAnaWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
                OnStage.theActorCalled("ana").wasAbleTo(OpenUp.thepage(), (Login.onThePage()));
            }

            @When("^he search for the course on the choucair academy platform$")
            public void heSearchForTheCourseAutomationResourcesBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception {
                    this.course = course;
                    OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
            }

            @Then("^he finds the course called resources $")
            public void heFindsTheCourseCalledResourcesAutomationBancolombia(String question) {
                OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
            }
}