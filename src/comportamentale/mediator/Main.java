package comportamentale.mediator;

import comportamentale.mediator.componente.ComponentA;
import comportamentale.mediator.componente.ComponentB;
import comportamentale.mediator.componente.ComponentC;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inizializzazione torre di controllo.");
        ConcreteMediator torreDiControllo = new ConcreteMediator();
        System.out.println("Ci sono 3 aerei.");
        ComponentA aereo1 = new ComponentA("Aereo1", torreDiControllo);
        ComponentB aereo2 = new ComponentB("Aereo2", torreDiControllo);
        ComponentC aereo3 = new ComponentC("Aereo3", torreDiControllo);

        torreDiControllo.setComponents(aereo1, aereo2, aereo3);
        aereo1.send("Posso atterrare?");
        aereo2.send("Posso atterrare?");
        aereo3.send("Sto decollando.");

    }
}
