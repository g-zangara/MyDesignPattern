package comportamentale.visitor.visitor;

import comportamentale.visitor.element.OrganoElement;

public class Elettrocardiogramma implements EsameMedicoVisitor {

    @Override
    public void elettrocardiogramma(OrganoElement e) {
        System.out.println("Elettrocardiogramma: "+e.getNome());
    }

    @Override
    public void ecocardiogramma(OrganoElement e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void risonanzaMagnetica(OrganoElement e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
