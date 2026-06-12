package strutturale.decorator.decorator;

import strutturale.decorator.service.Bevanda;

public class Zucchero extends AggiuntaDecorator{

    public Zucchero(Bevanda bevanda) {
        super(bevanda);
    }

    public String getNome() {
        return bevanda.getNome() + " con aggiunta di Zucchero";
    }

    public double getCosto() {
        return bevanda.getCosto() + 0.2;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getCosto() + " euro";
    }
}
