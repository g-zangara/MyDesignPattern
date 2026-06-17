package creazionale.abstractfactory.factory;

import creazionale.abstractfactory.product.Divano;
import creazionale.abstractfactory.product.DivanoModernStyle;
import creazionale.abstractfactory.product.Libreria;
import creazionale.abstractfactory.product.LibreriaModernStyle;
import creazionale.abstractfactory.product.Tavolino;
import creazionale.abstractfactory.product.TavolinoModernStyle;

public class MobilificioModernoFactory implements MobilificioABFactory {

    @Override
    public Divano createDivano() {
        return new DivanoModernStyle();
    }

    @Override
    public Libreria createLibreria() {
        return new LibreriaModernStyle();
    }

    @Override
    public Tavolino createTavolino() {
        return new TavolinoModernStyle();
    }

}
