package co.edu.udea.certificacion.petStore.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThe implements Task {

    private static final EnvironmentVariables env =
            SystemEnvironmentVariables.createEnvironmentVariables();

    private static final String URL = env.getProperty("main_page.url");

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL));
    }

    public static OpenThe page() {
        return instrumented(OpenThe.class);
    }
}