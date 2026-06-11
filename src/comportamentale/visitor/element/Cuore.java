package comportamentale.visitor.element;

import comportamentale.visitor.visitor.EsameMedicoVisitor;

public class Cuore implements OrganoElement {
    public Cuore() {
    }

    @Override
    public void accept(EsameMedicoVisitor visitor) {
        visitor.visita(this);
    }

    @Override
    public String getNome() {
        return "Cuore";
    }
}
