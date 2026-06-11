package creazionale.builder.builder;

import creazionale.builder.product.Product;

public interface AziendaBuilder {

    void reset();

    void buildStanze();
    void buildBagni();
    void buildPiani();
    void buildSuperficie();
    void buildMaterialiPareti();
    void buildTetto();
    void buildFinestre();
    void buildPorte();

    Product getProduct();

}
