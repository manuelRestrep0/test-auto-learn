package co.edu.udea.certificacion.petStore.stepdefinitions;


import co.edu.udea.certificacion.petStore.models.User;
import co.edu.udea.certificacion.petStore.questions.PromotionExists;
import co.edu.udea.certificacion.petStore.tasks.*;
import co.edu.udea.certificacion.petStore.questions.IsPromotionsVisible;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class FluffyLoginStepDefinition {

    @Before
    public void setUp() {
        setTheStage(new net.serenitybdd.screenplay.actors.OnlineCast());
    }

    @Given("que el usuario está en la página principal de Fluffy Deals Hub")
    public void openMainPage() {
        theActorCalled("usuario").attemptsTo(
                OpenThe.page()
        );
    }

    @When("accede al formulario de autenticación")
    public void goToLogin() {
        theActorInTheSpotlight().attemptsTo(
                GoToLoginPage.now()
        );
    }

    @And("ingresa sus credenciales {string} y {string}")
    public void enterCredentials(String email, String password) {
        theActorInTheSpotlight().attemptsTo(
                DoLogin.with(new User(email, password))
        );
    }

    @And("confirma el inicio de sesión")
    public void confirmLogin() {
        // Ya se confirma dentro de DoLoginFluffy, así que no se hace nada
    }

    @Then("debería ver la sección de promociones")
    public void verifyPromotionsVisible() {
        theActorInTheSpotlight().should(
                seeThat(IsPromotionsVisible.displayed())
        );
    }

    @And("crea la promoción con los datos:")
    public void createPromotionWithData(Map<String, String> data) {
        theActorInTheSpotlight().attemptsTo(
                CreatePromotion.withData(
                        data.get("name"),
                        data.get("start"),
                        data.get("end"),
                        data.get("description"),
                        data.get("category"),
                        data.get("discount")
                ),
                SelectProduct.confirm()
        );
    }

    @Then("debería ver la promoción {string} creada en la lista")
    public void verifyPromotionExists(String name) {
        theActorInTheSpotlight().should(
                seeThat(PromotionExists.withName(name))
        );
    }
}
