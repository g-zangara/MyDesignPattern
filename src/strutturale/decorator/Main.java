package strutturale.decorator;

import strutturale.decorator.decorator.AggiuntaDecorator;
import strutturale.decorator.decorator.Latte;
import strutturale.decorator.decorator.Zucchero;
import strutturale.decorator.service.Bevanda;
import strutturale.decorator.service.Caffe;

public class Main {
    public static void main(String[] args) {

        Bevanda caffe = new Caffe();
        System.out.println("Il cliente ordina un " + caffe.getNome() + " che costa " + caffe.getCosto());
        System.out.println("Il cliente vuole aggiungere dello zucchero al suo caffe");
        AggiuntaDecorator caffeConZucchero = new Zucchero(caffe);
        System.out.println(caffeConZucchero);

        System.out.println("Arriva un nuovo cliente e ordina un caffe, con latte e zucchero");
        AggiuntaDecorator caffeConZuccheroConLatte = new Latte(new Zucchero(new Caffe()));
        System.out.println(caffeConZuccheroConLatte);
    }
}
