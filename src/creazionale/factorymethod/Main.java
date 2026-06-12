package creazionale.factorymethod;

import creazionale.factorymethod.creator.Falegname1ConcreteCreator;
import creazionale.factorymethod.creator.Falegname2ConcreteCreator;
import creazionale.factorymethod.creator.FalegnameriaCreator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mi reco in falegnameria per compre degli articoli: ");
        FalegnameriaCreator falegnameria;

        System.out.println("Mi serve un tavolo in legno.");
        falegnameria = new Falegname1ConcreteCreator();
        falegnameria.newProduct();

        System.out.println("Mi serve anche una sedia in legno.");
        falegnameria = new Falegname2ConcreteCreator();
        falegnameria.newProduct();

    }
}
