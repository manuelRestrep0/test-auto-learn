package co.edu.udea.certificacion.petStore.questions;

import co.edu.udea.certificacion.petStore.userinterfaces.PromotionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsPromotionsVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return PromotionsPage.TITLE.resolveFor(actor).isVisible();
    }

    public static IsPromotionsVisible displayed() {
        return new IsPromotionsVisible();
    }
}