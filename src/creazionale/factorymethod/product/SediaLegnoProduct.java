package creazionale.factorymethod.product;

public class SediaLegnoProduct implements ProductInterface {

    @Override
    public String getName() {
        return "Sedia in legno";
    }

    @Override
    public double getPrice() {
        return 80.0;
    }

}
