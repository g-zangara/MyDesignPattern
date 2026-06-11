package comportamentale.visitor.visitor;

import comportamentale.visitor.element.Cuore;
import comportamentale.visitor.element.Fegato;
import comportamentale.visitor.element.Spalla;

public class Ecocardiogramma implements EsameMedicoVisitor {
    @Override
    public void visita(Cuore cuore) {
        System.out.println("Ecocardiogramma: " + cuore.getNome());
    }

    @Override
    public void visita(Fegato fegato) {
        System.out.println("Ecocardiogramma: " + fegato.getNome());
    }

    @Override
    public void visita(Spalla spalla) {
        throw new UnsupportedOperationException("Ecocardiogramma non applicabile alla spalla.");
    }

}
