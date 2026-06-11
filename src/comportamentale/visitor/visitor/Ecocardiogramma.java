package comportamentale.visitor.visitor;

import comportamentale.visitor.element.OrganoElement;

public class Ecocardiogramma implements EsameMedicoVisitor {
    @Override
    public void elettrocardiogramma(OrganoElement e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ecocardiogramma(OrganoElement e) {
        System.out.println("Eco cardiogramma: "+e.getNome());
    }

    @Override
    public void risonanzaMagnetica(OrganoElement e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
