package creazionale.abstractfactory;

import creazionale.abstractfactory.factory.MobilificioABFactory;
import creazionale.abstractfactory.factory.MobilificioClassicoFactory;
import creazionale.abstractfactory.factory.MobilificioModernoFactory;
import creazionale.abstractfactory.product.Divano;
import creazionale.abstractfactory.product.Libreria;
import creazionale.abstractfactory.product.Tavolino;

public class Main {
    public static void main(String[] args) {

        MobilificioABFactory mobilificioClassico = new MobilificioClassicoFactory();
        System.out.println("Creazione mobili classici:");
        Divano divanoClassico = mobilificioClassico.createDivano();
        System.out.println("Divano classico creato: " + divanoClassico.getNome());
        Libreria libreriaClassica = mobilificioClassico.createLibreria();
        System.out.println("Libreria classica creata: " + libreriaClassica.getNome());
        Tavolino tavolinoClassico = mobilificioClassico.createTavolino();
        System.out.println("Tavolino classico creato: " + tavolinoClassico.getNome());

        MobilificioABFactory mobilificioModerno = new MobilificioModernoFactory();
        System.out.println("Creazione mobili moderni:");
        Divano divanoModerno = mobilificioModerno.createDivano();
        System.out.println("Divano moderno creato: " + divanoModerno.getNome());
        Libreria libreriaModerna = mobilificioModerno.createLibreria();
        System.out.println("Libreria moderna creata: " + libreriaModerna.getNome());
        Tavolino tavolinoModerno = mobilificioModerno.createTavolino();
        System.out.println("Tavolino moderno creato: " + tavolinoModerno.getNome());

    }
}
