package comportamentale.visitor.element;

import comportamentale.visitor.visitor.EsameMedicoVisitor;

public interface OrganoElement {
    public void accept(EsameMedicoVisitor visitor);
    public String getNome();
}
