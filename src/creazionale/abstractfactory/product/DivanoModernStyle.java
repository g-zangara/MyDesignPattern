package creazionale.abstractfactory.product;

public class DivanoModernStyle implements Divano {

    @Override
    public String getNome() {
        return "Questo è un divano moderno.";
    }

    @Override
    public String getDescrizione() {
        return "Divano moderno in puro stile moderno.";
    }

}
