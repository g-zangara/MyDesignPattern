package creazionale.factorymethod.creator;

import creazionale.factorymethod.product.ProductInterface;
import creazionale.factorymethod.product.SediaLegnoProduct;

public class Falegname2ConcreteCreator extends FalegnameriaCreator{

    @Override
    protected ProductInterface createProduct() {
        return new SediaLegnoProduct();
    }

}
