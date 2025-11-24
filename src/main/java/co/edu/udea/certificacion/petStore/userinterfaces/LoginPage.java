package co.edu.udea.certificacion.petStore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target EMAIL_FIELD = Target.the("campo de email")
            .locatedBy("//input[@id='email']");

    public static final Target PASSWORD_FIELD = Target.the("campo de password")
            .locatedBy("//input[@id='password']");

    public static final Target LOGIN_BUTTON = Target.the("botón iniciar sesión")
            .locatedBy("//button[@type='submit']");
}
