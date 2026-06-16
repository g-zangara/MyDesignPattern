package strutturale.bridge.abstractor;

import strutturale.bridge.implementator.Televisione;

public class TelecomandoAvanzato extends Telecomando {

    public TelecomandoAvanzato(Televisione televisione) {
        super(televisione);
    }

    @Override
    public void operation() {
        System.out.println("Telecomando avanzato: ha anche il pulsante per cambiare canale.");
        televisione.operationImpl();
    }

}
