package strutturale.decorator.decorator;

import strutturale.decorator.service.Bevanda;

public class Latte extends AggiuntaDecorator{

    public Latte (Bevanda bevanda){
        super(bevanda);
    }

    public String getNome(){
        return bevanda.getNome() + " con aggiunta di Latte";
    }

    public double getCosto(){
        return bevanda.getCosto() + 0.5;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getCosto() + " euro";
    }

}
