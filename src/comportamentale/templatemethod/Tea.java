package comportamentale.templatemethod;

public class Tea extends PreparazioneBevandaTemplate {

    @Override
    protected String bollireAcqua() {
        return "Bollire l'acqua per il tè";
    }

    @Override
    protected String preparareIngredientePrincipale() {
        return "Preparare il tè";
    }

    @Override
    protected String versareInTazza() {
        return "Versare il tè nella tazza";
    }

}
