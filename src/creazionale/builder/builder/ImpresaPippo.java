package creazionale.builder.builder;

import creazionale.builder.product.Casa;

public class ImpresaPippo implements AziendaBuilder{

    Casa casa = new Casa();

    @Override
    public void buildStanze() {
        casa.setNumeroStanze(5);
    }

    @Override
    public void buildBagni() {
        casa.setNumeroBagni(2);
    }

    @Override
    public void buildPiani() {
        casa.setNumeroPiani(2);
    }

    @Override
    public void buildSuperficie() {
        casa.setSuperficieMq(150);
    }

    @Override
    public void buildMaterialiPareti() {
        casa.setTipoMaterialePareti("mattoni");
    }

    @Override
    public void buildTetto() {
        casa.setTipoTetto("tetto 30 gradi");
    }

    @Override
    public void buildFinestre() {
        casa.setNumeroFinestre(10);
    }

    @Override
    public void buildPorte() {
        casa.setNumeroPorte(2);
    }

    @Override
    public Casa getProduct() {
        return casa;
    }
}
