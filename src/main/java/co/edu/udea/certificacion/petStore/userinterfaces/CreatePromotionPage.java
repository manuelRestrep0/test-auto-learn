package co.edu.udea.certificacion.petStore.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreatePromotionPage {
    public static final Target NAME = Target.the("nombre")
            .located(By.id("name"));

    public static final Target START_DATE = Target.the("fecha inicio")
            .located(By.id("startDate"));

    public static final Target END_DATE = Target.the("fecha fin")
            .located(By.id("endDate"));

    public static final Target DESCRIPTION = Target.the("descripción")
            .located(By.id("description"));

    public static final Target CATEGORY_BUTTON = Target.the("botón categoría")
            .located(By.cssSelector("button[role='combobox']"));

    public static final Target DISCOUNT = Target.the("descuento")
            .located(By.id("discount"));

    public static final Target NEXT_BUTTON = Target.the("siguiente")
            .located(By.xpath("//button[contains(.,'Siguiente')]"));

}
