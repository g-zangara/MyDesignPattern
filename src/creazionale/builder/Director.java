package creazionale.builder;

import creazionale.builder.builder.AziendaBuilder;

public class Director {

    public void build(AziendaBuilder b) {
        b.reset();
        b.buildStanze();
        b.buildBagni();
        b.buildPiani();
        b.buildSuperficie();
        b.buildMaterialiPareti();
        b.buildTetto();
        b.buildFinestre();
        b.buildPorte();
    }

}
