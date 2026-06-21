package comportamentale.mediator;

import comportamentale.mediator.componente.Component;
import comportamentale.mediator.componente.ComponentA;
import comportamentale.mediator.componente.ComponentB;
import comportamentale.mediator.componente.ComponentC;

public class ConcreteMediator implements Mediator {

    private ComponentA componentA;
    private ComponentB componentB;
    private ComponentC componentC;

    public void setComponents(ComponentA componentA, ComponentB componentB, ComponentC componentC) {
        this.componentA = componentA;
        this.componentB = componentB;
        this.componentC = componentC;
    }

    @Override
    public void notify(Component sender) {

        if (componentA == null || componentB == null || componentC == null) {
            throw new IllegalStateException("I componenti devono essere registrati nel mediatore prima dell'uso.");
        }

        if (sender instanceof ComponentA) {
            reactOnA();
        } else if (sender instanceof ComponentB) {
            reactOnB();
        } else if (sender instanceof ComponentC) {
            reactOnC();
        }

    }

    private void reactOnA() {
        System.out.println("Torre di controllo gestisce il messaggio di " + componentA.getName() +", dice: ");
        componentB.operation("Mantieni la quota.");
        componentC.operation("Libera la pista.");
    }

    private void reactOnB() {
        System.out.println("Torre di controllo gestisce il messaggio di " + componentB.getName()+", dice: ");
        componentA.operation("Attendi autorizzazione.");
        componentC.operation("Prepara il decollo in sicurezza.");
    }

    private void reactOnC() {
        System.out.println("Torre di controllo gestisce il messaggio di " + componentC.getName()+", dice: ");
        componentA.operation("Pista occupata.");
        componentB.operation("Rallenta l'avvicinamento.");
    }

}
