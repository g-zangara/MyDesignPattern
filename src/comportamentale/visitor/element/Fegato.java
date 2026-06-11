package comportamentale.visitor.element;

import comportamentale.visitor.visitor.EsameMedicoVisitor;

public class Fegato implements OrganoElement {

    public Fegato() {
    }

    @Override
    public void accept(EsameMedicoVisitor visitor) {
        visitor.ecocardiogramma(this);
    }

    @Override
    public String getNome() {
        return "Fegato";
    }
}
