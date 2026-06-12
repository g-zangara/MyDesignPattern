package creazionale.factorymethod.product;

public class TavoloLegnoProduct implements ProductInterface {

    @Override
    public String getName() {
        return "Tavolo in legno";
    }

    @Override
    public double getPrice() {
        return 150.0;
    }

}
