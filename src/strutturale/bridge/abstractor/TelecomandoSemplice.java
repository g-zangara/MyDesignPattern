package strutturale.bridge.abstractor;

import strutturale.bridge.implementator.Televisione;

public class TelecomandoSemplice extends Telecomando {

    public TelecomandoSemplice(Televisione televisione) {
        super(televisione);
    }

    @Override
    public void operation() {
        System.out.println("Telecomando semplice: ha solo il pulsante accensione/spegnimento.");
        televisione.operationImpl();
    }

}
