package comportamentale.visitor.visitor;

import comportamentale.visitor.element.Cuore;
import comportamentale.visitor.element.Fegato;
import comportamentale.visitor.element.Spalla;

public class RisonanzaMagnetica implements EsameMedicoVisitor {
    @Override
    public void visita(Cuore cuore) {
        System.out.println("Risonanza magnetica: " + cuore.getNome());
    }

    @Override
    public void visita(Fegato fegato) {
        System.out.println("Risonanza magnetica: " + fegato.getNome());
    }

    @Override
    public void visita(Spalla spalla) {
        System.out.println("Risonanza magnetica: " + spalla.getNome());
    }
}
