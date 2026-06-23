package comportamentale.templatemethod;

public class Cioccolata extends PreparazioneBevandaTemplate {

    @Override
    protected String bollireAcqua() {
        return "Bollire l'acqua per la cioccolata";
    }

    @Override
    protected String preparareIngredientePrincipale() {
        return "Preparare la cioccolata";
    }

    @Override
    protected String versareInTazza() {
        return "Versare la cioccolata nella tazza";
    }

    @Override
    protected String aggiungereIngredientiHook(String ingrediente) {
        if (ingrediente == null || ingrediente.isBlank()) {
            return "Aggiunta panna di default.";
        }
        return "Aggiunta panna con " + ingrediente;
    }
}

