package creazionale.factorymethod.creator;

import creazionale.factorymethod.product.ProductInterface;
import creazionale.factorymethod.product.TavoloLegnoProduct;

public class Falegname1ConcreteCreator extends FalegnameriaCreator{

    @Override
    protected ProductInterface createProduct() {
        return new TavoloLegnoProduct();
    }

}
