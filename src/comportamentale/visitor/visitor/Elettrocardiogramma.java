package comportamentale.visitor.visitor;

import comportamentale.visitor.element.Cuore;
import comportamentale.visitor.element.Fegato;
import comportamentale.visitor.element.Spalla;

public class Elettrocardiogramma implements EsameMedicoVisitor {

    @Override
    public void visita(Cuore cuore) {
        System.out.println("Elettrocardiogramma: " + cuore.getNome());
    }

    @Override
    public void visita(Fegato fegato) {
        throw new UnsupportedOperationException("Elettrocardiogramma non applicabile al fegato.");
    }

    @Override
    public void visita(Spalla spalla) {
        throw new UnsupportedOperationException("Elettrocardiogramma non applicabile alla spalla.");
    }
}
