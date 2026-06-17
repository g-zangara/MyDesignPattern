package creazionale.abstractfactory.product;

public class DivanoClassicStyle implements Divano {

    @Override
    public String getNome() {
        return "Questo è un divano classico.";
    }

    @Override
    public String getDescrizione() {
        return "Divano classico in puro stile classico.";
    }

}
