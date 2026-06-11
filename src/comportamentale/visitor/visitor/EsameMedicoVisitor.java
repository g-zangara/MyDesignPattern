package comportamentale.visitor.visitor;

import comportamentale.visitor.element.Cuore;
import comportamentale.visitor.element.Fegato;
import comportamentale.visitor.element.Spalla;

public interface EsameMedicoVisitor {
    void visita(Cuore cuore);
    void visita(Fegato fegato);
    void visita(Spalla spalla);
}
