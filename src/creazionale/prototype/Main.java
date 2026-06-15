package creazionale.prototype;

public class Main {
    public static void main(String[] args) {
        Fotocopiatrice fotocopiatrice = new Fotocopiatrice();

        String[] domandePrimoFoglio = {"Domanda 1", "Domanda 2", "Domanda 3"};
        String[] rispostePrimoFoglio = {"Risposta 1", "Risposta 2", "Risposta 3"};
        Foglio foglioOriginaleUno = new Foglio("Questo è un foglio dove viene fornito il primo set di domande!",
                new Contenuto(domandePrimoFoglio, rispostePrimoFoglio));

        //shallow copy
        System.out.println("Effettuo una shallowCopy del primo foglio...");
        Foglio copiaShallow = fotocopiatrice.faiUnaCopiaShallow(foglioOriginaleUno);
        copiaShallow.setIntestazioneFoglio("Copia shallow del quiz");
        copiaShallow.aggiornaRisposta(0, "Risposta cambiata nella copia shallow");
        //con la shallow copy il contenuto interno è condiviso, quindi la modifica alla risposta compare anche nell'originale.
        System.out.println("Originale: " + foglioOriginaleUno);
        System.out.println("Copia:     " + copiaShallow);

        System.out.println("---------------------------------------------");

        //deep copy
        System.out.println("Effettuo una deepCopy del secondo foglio...");
        String[] domandeSecondoFoglio = {"Domanda 4", "Domanda 5", "Domanda 6"};
        String[] risposteSecondoFoglio = {"Risposta 4", "Risposta 5", "Risposta 6"};
        Foglio foglioOriginaleDue= new Foglio("Questo è un altro foglio dove viene fornito il secondo set di domande!",
                new Contenuto(domandeSecondoFoglio, risposteSecondoFoglio));
        Foglio copiaDeep = fotocopiatrice.faiUnaCopiaDeep(foglioOriginaleDue);
        copiaDeep.setIntestazioneFoglio("Copia deep del quiz");
        copiaDeep.aggiornaRisposta(2, "Risposta cambiata nella copia deep");

        //con la deep copy la copia ha un contenuto indipendente, quindi l'originale non viene modificato
        System.out.println("Originale: " + foglioOriginaleDue);
        System.out.println("Copia:     " + copiaDeep);
    }

}
