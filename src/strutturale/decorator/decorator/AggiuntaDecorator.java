package strutturale.decorator.decorator;

import strutturale.decorator.service.Bevanda;

public abstract class AggiuntaDecorator implements Bevanda {

    protected Bevanda bevanda;

    public AggiuntaDecorator(Bevanda bevanda){
        this.bevanda = bevanda;
    }

    @Override
    public abstract String getNome();

    @Override
    public abstract double getCosto();

}
