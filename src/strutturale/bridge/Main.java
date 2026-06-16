package strutturale.bridge;

import strutturale.bridge.abstractor.TelecomandoAvanzato;
import strutturale.bridge.abstractor.TelecomandoSemplice;
import strutturale.bridge.implementator.TelevisioneLG;
import strutturale.bridge.implementator.TelevisioneSamsung;
import strutturale.bridge.implementator.TelevisioneSony;

public class Main {
    public static void main(String[] args) {

        System.out.println("Telecomando semplice collegato a Samsung:");
        TelecomandoSemplice telecomandoSamsung = new TelecomandoSemplice(new TelevisioneSamsung());
        telecomandoSamsung.operation();

        System.out.println("Telecomando avanzato collegato a Samsung:");
        TelecomandoAvanzato telecomandoAvanzatoSamsung = new TelecomandoAvanzato(new TelevisioneSamsung());
        telecomandoAvanzatoSamsung.operation();

        System.out.println("Telecomando semplice collegato a Sony:");
        TelecomandoSemplice telecomandoSony = new TelecomandoSemplice(new TelevisioneSony());
        telecomandoSony.operation();

        System.out.println("Telecomando avanzato collegato a LG:");
        TelecomandoAvanzato telecomandoAvanzatoLG = new TelecomandoAvanzato(new TelevisioneLG());
        telecomandoAvanzatoLG.operation();

    }
}
