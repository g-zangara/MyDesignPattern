package comportamentale.visitor.visitor;

import comportamentale.visitor.element.OrganoElement;

public class RisonanzaMagnetica implements EsameMedicoVisitor {
    @Override
    public void elettrocardiogramma(OrganoElement e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void ecocardiogramma(OrganoElement e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void risonanzaMagnetica(OrganoElement e) {
        System.out.println("Risonanza magnetica: "+e.getNome());
    }
}
