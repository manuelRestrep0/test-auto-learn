package co.edu.udea.certificacion.petStore.tasks;

import co.edu.udea.certificacion.petStore.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;

public class GoToLoginPage implements Task {

    public static GoToLoginPage now() {
        return instrumented(GoToLoginPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.LOGIN_ICON)
        );
    }
}
