package creazionale.abstractfactory.factory;

import creazionale.abstractfactory.product.Divano;
import creazionale.abstractfactory.product.Libreria;
import creazionale.abstractfactory.product.Tavolino;

public interface MobilificioABFactory {

    Divano createDivano();
    Libreria createLibreria();
    Tavolino createTavolino();

}
