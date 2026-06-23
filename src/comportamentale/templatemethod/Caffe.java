package comportamentale.templatemethod;

public class Caffe extends PreparazioneBevandaTemplate {

    @Override
    protected String bollireAcqua() {
        return "Bollire l'acqua per il caffè";
    }

    @Override
    protected String preparareIngredientePrincipale() {
        return "Preparare il caffè";
    }

    @Override
    protected String versareInTazza() {
        return "Versare il caffè nella tazza";
    }

}
