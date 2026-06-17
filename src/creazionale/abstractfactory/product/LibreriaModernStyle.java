package creazionale.abstractfactory.product;

public class LibreriaModernStyle implements Libreria {

    @Override
    public String getNome() {
        return "Questa è una libreria moderna.";
    }

    @Override
    public String getDescrizione() {
        return "Libreria moderna in puro stile moderno.";
    }

}
