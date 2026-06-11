package comportamentale.visitor;

import comportamentale.visitor.element.Cuore;
import comportamentale.visitor.element.Fegato;
import comportamentale.visitor.element.Spalla;
import comportamentale.visitor.visitor.Ecocardiogramma;
import comportamentale.visitor.visitor.Elettrocardiogramma;
import comportamentale.visitor.visitor.RisonanzaMagnetica;

public class main {
    public static void main(String[] args) {
        CorpoUmanoObjectStructor structor = new CorpoUmanoObjectStructor();

        System.out.println("Sto visitando il cuore.");
        structor.visita(new Cuore(), new Elettrocardiogramma());

        System.out.println("Sto visitando il fegato.");
        structor.visita(new Fegato(), new Ecocardiogramma());

        System.out.println("Sto visitando la spalla.");
        structor.visita(new Spalla(), new RisonanzaMagnetica());

        //Provo a far genrare errore
        try{
            System.out.println("Provo a visitare una spalla con un elettrocardiogramma.");
            structor.visita(new Spalla(), new Elettrocardiogramma());
        }catch (UnsupportedOperationException e){
            System.out.println("Errore: "+e.getMessage());
        }
    }
}
