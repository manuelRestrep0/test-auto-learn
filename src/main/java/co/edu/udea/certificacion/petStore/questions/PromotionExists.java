package co.edu.udea.certificacion.petStore.questions;

import co.edu.udea.certificacion.petStore.userinterfaces.PromotionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PromotionExists implements Question<Boolean> {

    private final String promoName;

    public PromotionExists(String promoName) {
        this.promoName = promoName;
    }

    public static PromotionExists withName(String name) {
        return new PromotionExists(name);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return PromotionsPage.PROMO_NAME_IN_LIST.of(promoName).resolveFor(actor).isVisible();
    }
}
