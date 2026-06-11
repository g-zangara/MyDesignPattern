package creazionale.builder.builder;

import creazionale.builder.product.Casa;

public class ImpresaPaperino implements AziendaBuilder{
    private Casa casa;

    @Override
    public void reset() {
        casa = new Casa();
    }

    @Override
    public void buildStanze() {
        casa.setNumeroStanze(3);
    }

    @Override
    public void buildBagni() {
        casa.setNumeroBagni(1);
    }

    @Override
    public void buildPiani() {
        casa.setNumeroPiani(1);
    }

    @Override
    public void buildSuperficie() {
        casa.setSuperficieMq(100);
    }

    @Override
    public void buildMaterialiPareti() {
        casa.setTipoMaterialePareti("legno");
    }

    @Override
    public void buildTetto() {
        casa.setTipoTetto("tetto in poliestere");
    }

    @Override
    public void buildFinestre() {
        casa.setNumeroFinestre(4);
    }

    @Override
    public void buildPorte() {
        casa.setNumeroPorte(4);
    }

    @Override
    public Casa getProduct() {
        return casa;
    }

}
