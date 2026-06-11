package comportamentale.visitor.element;

import comportamentale.visitor.visitor.EsameMedicoVisitor;

public class Spalla implements OrganoElement {
    public Spalla() {
    }

    @Override
    public void accept(EsameMedicoVisitor visitor) {
        visitor.visita(this);
    }

    @Override
    public String getNome() {
        return "Spalla";
    }
}
