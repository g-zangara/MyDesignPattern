package creazionale.abstractfactory.product;

public class LibreriaClassicStyle implements Libreria {

    @Override
    public String getNome() {
        return "Questa è una libreria classica.";
    }

    @Override
    public String getDescrizione() {
        return "Libreria classica in puro stile classico.";
    }

}
