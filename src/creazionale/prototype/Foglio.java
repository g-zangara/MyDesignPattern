package creazionale.prototype;

public class Foglio implements Prototype<Foglio> {

    private String intestazioneFoglio;
    private Contenuto contenuto;

    public Foglio(String intestazioneFoglio, Contenuto contenuto) {
        this.intestazioneFoglio = intestazioneFoglio;
        this.contenuto = contenuto;
    }

    public String getIntestazioneFoglio() {
        return intestazioneFoglio;
    }

    public Contenuto getContenuto() {
        return contenuto;
    }

    public void setContenuto(Contenuto contenuto) {
        this.contenuto = contenuto;
    }

    public void setIntestazioneFoglio(String intestazioneFoglio) {
        this.intestazioneFoglio = intestazioneFoglio;
    }

    public void aggiornaRisposta(int indice, String nuovaRisposta) {
        contenuto.aggiornaRisposta(indice, nuovaRisposta);
    }

    @Override
    public Foglio copiaShallow() {
        return new Foglio(intestazioneFoglio, contenuto);
    }

    @Override
    public Foglio copiaDeep() {
        return new Foglio(intestazioneFoglio, contenuto.copiaDeep());
    }

    @Override
    public String toString() {
        return "{" +
                "intestazione = '" + intestazioneFoglio + '\'' +
                ", contenuto = " + contenuto +
                '}';
    }

}
