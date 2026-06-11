package comportamentale.visitor;

import comportamentale.visitor.element.OrganoElement;
import comportamentale.visitor.visitor.EsameMedicoVisitor;

public class CorpoUmanoObjectStructor{

    public CorpoUmanoObjectStructor(){}

    public void visita(OrganoElement organo, EsameMedicoVisitor visitor){
        System.out.println("Sto effettuando la visita..");
        organo.accept(visitor);
        System.out.println("Visita terminata.");
    }

}
