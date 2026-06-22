package comportamentale.memento;

import java.util.Stack;

public class Caretaker {

    private final Originator originator;
    private final Stack<Memento> mementoStack;

    public Caretaker(Originator originator){
        this.originator = originator;
        this.mementoStack = new Stack<>();
    }

    public void saveState(){
        Memento m = originator.saveMemento();
        System.out.println("Caretaker: Salvo lo stato attuale dell'originator -> "+m.getState());
        mementoStack.push(m);
    }

    public void restoreState(){
        if(mementoStack.isEmpty()){
            System.out.println("Caretaker: Nessuno stato disponibile da ripristinare.");
            return;
        }
        Memento m = mementoStack.pop();
        System.out.println("Caretaker: Ripristino stato precedente -> "+m.getState());
        originator.restoreMemento(m);
    }

}
