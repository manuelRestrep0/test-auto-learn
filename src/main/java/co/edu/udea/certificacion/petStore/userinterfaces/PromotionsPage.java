package co.edu.udea.certificacion.petStore.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PromotionsPage {

    public static final Target CREATE_BUTTON = Target.the("botón Crear")
            .located(By.xpath("//button[contains(.,'Crear')]"));

    public static final Target TITLE = Target.the("título promociones")
            .located(By.xpath("//h1[contains(.,'Promociones')]"));

    public static final Target PROMO_NAME_IN_LIST = Target.the("nombre de promo en lista")
            .locatedBy("//h3[contains(.,'{0}')]");
}
