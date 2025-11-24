package co.edu.udea.certificacion.petStore.tasks;

import co.edu.udea.certificacion.petStore.userinterfaces.PromotionsPage;
import co.edu.udea.certificacion.petStore.userinterfaces.SelectProductPage;
import co.edu.udea.certificacion.petStore.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SelectProductPage.PRODUCT_CHECKBOX, isVisible())
                        .forNoMoreThan(5).seconds(),

                Click.on(SelectProductPage.PRODUCT_CHECKBOX),
                WaitTime.forMillis(300),
                Click.on(SelectProductPage.SAVE_BUTTON),
                WaitTime.forMillis(300),
                WaitUntil.the(PromotionsPage.TITLE, isVisible())
                        .forNoMoreThan(5).seconds(),
                WaitTime.forMillis(5000)
                );
    }

    public static SelectProduct confirm() {
        return new SelectProduct();
    }
}
