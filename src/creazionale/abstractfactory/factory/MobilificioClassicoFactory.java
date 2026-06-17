package creazionale.abstractfactory.factory;

import creazionale.abstractfactory.product.Divano;
import creazionale.abstractfactory.product.DivanoClassicStyle;
import creazionale.abstractfactory.product.Libreria;
import creazionale.abstractfactory.product.LibreriaClassicStyle;
import creazionale.abstractfactory.product.Tavolino;
import creazionale.abstractfactory.product.TavolinoClassicStyle;

public class MobilificioClassicoFactory implements MobilificioABFactory {

    @Override
    public Divano createDivano() {
        return new DivanoClassicStyle();
    }

    @Override
    public Libreria createLibreria() {
        return new LibreriaClassicStyle();
    }

    @Override
    public Tavolino createTavolino() {
        return new TavolinoClassicStyle();
    }

}
