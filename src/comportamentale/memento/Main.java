package comportamentale.memento;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simulo un editor di testo con undo");
        Originator originator = new Originator("Testo iniziale");
        Caretaker caretaker = new Caretaker(originator);
        System.out.println("Stato attuale: " + originator.getState());

        caretaker.saveState();
        System.out.println("Modifico il testo.");
        originator.setState("Testo modificato");
        System.out.println("Stato attuale: " + originator.getState());

        caretaker.saveState();
        System.out.println("Modifico il testo.");
        originator.setState("Testo modificato ancora");
        System.out.println("Stato attuale: " + originator.getState());

        System.out.println("Ora effettuo un ripristino della versione precedente.");
        caretaker.restoreState();
        System.out.println("Stato attuale: " + originator.getState());

        System.out.println("Ora vado ad aggiornare ancora il testo.");
        caretaker.saveState();
        originator.setState("Testo modificato ancora di più.");
        System.out.println("Stato attuale: " + originator.getState());

        System.out.println("Ora voglio tornare alla versione inziale.");
        caretaker.restoreState();
        caretaker.restoreState();
        System.out.println("Stato attuale: " + originator.getState());
    }
}
