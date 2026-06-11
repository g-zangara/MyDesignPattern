package creazionale.builder;

import creazionale.builder.builder.ImpresaPaperino;
import creazionale.builder.builder.ImpresaPippo;
import creazionale.builder.product.Product;

public class main {
    public static void main(String[] args) {
        System.out.println("Sono un cliente e voglio creare una casa.");
        Product p;

        System.out.println("Mi rivolgo ad un'impresa edile per costruire la mia casa.");
        Director director = new Director();
        ImpresaPippo impresaPippo = new ImpresaPippo();
        director.build(impresaPippo);
        System.out.println("Il direttore ha detto all'impresa edile pippo come costruire la casa.");
        p = impresaPippo.getProduct();
        System.out.println("La casa è stata costruita: " + p);

        System.out.println("Mi rivolgo ad un'altra impresa edile paperino per costruire la mia seconda casa.");
        ImpresaPaperino impresaPaperino = new ImpresaPaperino();
        director.build(impresaPaperino);
        System.out.println("Il direttore ha detto all'impresa edile paperino come costruire la casa.");
        p = impresaPaperino.getProduct();
        System.out.println("La casa è stata costruita: " + p);
    }
}
