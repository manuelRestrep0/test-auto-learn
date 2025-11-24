package co.edu.udea.certificacion.petStore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {

    public static final Target LOGIN_ICON = Target.the("icono de login en página principal")
            .locatedBy("//a[@href='/login']/button");
}
