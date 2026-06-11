package comportamentale.visitor.visitor;

import comportamentale.visitor.element.OrganoElement;

public interface EsameMedicoVisitor {
    public void elettrocardiogramma(OrganoElement e);
    public void ecocardiogramma(OrganoElement e);
    public void risonanzaMagnetica(OrganoElement e);
}
