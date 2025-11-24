package co.edu.udea.certificacion.petStore.tasks;

import co.edu.udea.certificacion.petStore.userinterfaces.CreatePromotionPage;
import co.edu.udea.certificacion.petStore.userinterfaces.PromotionsPage;
import co.edu.udea.certificacion.petStore.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreatePromotion implements Task {

    private final String name;
    private final String start;
    private final String end;
    private final String description;
    private final String category;
    private final String discount;

    public CreatePromotion(String name, String start, String end, String description, String category, String discount) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.description = description;
        this.category = category;
        this.discount = discount;
    }

    public static CreatePromotion withData(String name, String start, String end, String description, String category, String discount) {
        return new CreatePromotion(name, start, end, description, category, discount);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PromotionsPage.CREATE_BUTTON),
                WaitTime.forMillis(300),

                WaitUntil.the(CreatePromotionPage.NAME, isVisible())
                        .forNoMoreThan(5).seconds(),

                Enter.theValue(name).into(CreatePromotionPage.NAME),
                WaitTime.forMillis(300),
                Enter.theValue(start).into(CreatePromotionPage.START_DATE),
                WaitTime.forMillis(300),
                Enter.theValue(end).into(CreatePromotionPage.END_DATE),
                WaitTime.forMillis(300),
                Enter.theValue(description).into(CreatePromotionPage.DESCRIPTION),
                WaitTime.forMillis(300),

                Click.on(CreatePromotionPage.CATEGORY_BUTTON),
                Hit.the(Keys.ENTER).into(CreatePromotionPage.CATEGORY_BUTTON),
                WaitTime.forMillis(300),

                Enter.theValue(discount).into(CreatePromotionPage.DISCOUNT),
                WaitTime.forMillis(300),

                Click.on(CreatePromotionPage.NEXT_BUTTON)
        );
    }
}
