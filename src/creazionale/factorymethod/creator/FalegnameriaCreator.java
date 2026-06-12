package creazionale.factorymethod.creator;

import creazionale.factorymethod.product.ProductInterface;

public abstract class FalegnameriaCreator {

    public void newProduct(){
        ProductInterface product = createProduct();
        printProduct(product);
    }

    protected abstract ProductInterface createProduct();

    protected void printProduct(ProductInterface product) {
        System.out.println("Ho preso un "+product.getName()+", al costo di "+product.getPrice()+" euro.");
    }
}
