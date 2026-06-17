package creazionale.abstractfactory.product;

public class TavolinoClassicStyle implements Tavolino {

    @Override
    public String getNome() {
        return "Questo è un tavolino classico.";
    }

    @Override
    public String getDescrizione() {
        return "Tavolino classico in puro stile classico.";
    }

}
