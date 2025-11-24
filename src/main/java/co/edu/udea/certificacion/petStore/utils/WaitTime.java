package co.edu.udea.certificacion.petStore.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitTime implements Interaction {

    private final int millis;

    public WaitTime(int millis) {
        this.millis = millis;
    }

    public static WaitTime forMillis(int millis) {
        return new WaitTime(millis);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
