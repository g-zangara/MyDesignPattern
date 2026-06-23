package comportamentale.templatemethod;

public abstract class PreparazioneBevandaTemplate {

    public final void preparaBevandaTemplateMethod(String ingredienteAggiuntivo){
        System.out.println(bollireAcqua());
        System.out.println(preparareIngredientePrincipale());
        System.out.println(versareInTazza());
        System.out.println(aggiungereIngredientiHook(ingredienteAggiuntivo));
    }

    protected abstract String bollireAcqua();
    protected abstract String preparareIngredientePrincipale();
    protected abstract String versareInTazza();

    protected String aggiungereIngredientiHook(String ingrediente) {
        if(ingrediente==null)
            return "Nessun ingrediente aggiunto.";
        return "Aggiunto: " +ingrediente;
    }

}
