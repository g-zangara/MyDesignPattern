package creazionale.abstractfactory.product;

public class TavolinoModernStyle implements Tavolino {

    @Override
    public String getNome() {
        return "Questo è un tavolino moderno.";
    }

    @Override
    public String getDescrizione() {
        return "Tavolino moderno in puro stile moderno.";
    }

}
