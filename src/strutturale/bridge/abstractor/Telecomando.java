package strutturale.bridge.abstractor;

import strutturale.bridge.implementator.Televisione;

public abstract class Telecomando {

    protected Televisione televisione;

    public Telecomando(Televisione televisione) {
        this.televisione = televisione;
    }

    public abstract void operation();

}
