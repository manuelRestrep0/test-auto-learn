package co.edu.udea.certificacion.petStore.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterThe implements Interaction {

    private final String text;
    private final Target field;

    public EnterThe(String text, Target field) {
        this.text = text;
        this.field = field;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(text).into(field)
        );
    }

    public static EnterThe value(String text, Target field) {
        return instrumented(EnterThe.class, text, field);
    }
}
