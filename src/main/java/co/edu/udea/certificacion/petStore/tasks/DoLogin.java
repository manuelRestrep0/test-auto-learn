package co.edu.udea.certificacion.petStore.tasks;

import co.edu.udea.certificacion.petStore.models.User;
import co.edu.udea.certificacion.petStore.userinterfaces.LoginPage;
import co.edu.udea.certificacion.petStore.userinterfaces.PromotionsPage;
import co.edu.udea.certificacion.petStore.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DoLogin implements Task {

    private final User user;

    public DoLogin(User user) {
        this.user = user;
    }

    public static DoLogin with(User user) {
        return instrumented(DoLogin.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getUsername()).into(LoginPage.EMAIL_FIELD),
                WaitTime.forMillis(300),
                Enter.theValue(user.getPassword()).into(LoginPage.PASSWORD_FIELD),
                WaitTime.forMillis(300),
                Click.on(LoginPage.LOGIN_BUTTON),
                WaitTime.forMillis(300),
                WaitUntil.the(PromotionsPage.TITLE, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
