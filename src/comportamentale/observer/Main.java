package comportamentale.observer;

import comportamentale.observer.manager.DAGChangeManager;
import comportamentale.observer.manager.SimpleChangeManager;
import comportamentale.observer.observer.ConcreteObserver;
import comportamentale.observer.subject.ConcreteSubject;

public class Main {
    public static void main(String[] args) {

        pullmethod();
        System.out.println("------------------------------");
        pushMethod();
        System.out.println("------------------------------");
        changeManagerMethod();
        System.out.println("------------------------------");
        dagChangeManagerMethod();

    }

    private static void pullmethod() {

        System.out.println("Vado a creare un subject a cui vado a fare 3 sottoscrizioni.");
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1", concreteSubject);
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2", concreteSubject);
        ConcreteObserver observer3 = new ConcreteObserver("Observer 3", concreteSubject);
        concreteSubject.attach(observer1);
        concreteSubject.attach(observer2);
        concreteSubject.attach(observer3);

        System.out.println("Vado a cambiare lo stato del subject, questo notificherà tutti gli observer.");
        concreteSubject.setState("State changed!");

        System.out.println("Verifico che tutti gli observer abbiamo recepito il cambio di stato.");
        System.out.println("Observer 1 state: " + observer1.getObserverState());
        System.out.println("Observer 2 state: " + observer2.getObserverState());
        System.out.println("Observer 3 state: " + observer3.getObserverState());

        System.out.println("Ora stacco observer 2 e cambio stato.");
        concreteSubject.detach(observer2);
        concreteSubject.setState("State changed again!");
        System.out.println("Verifico che observer 2 non abbia ricevuto la notifica.");
        System.out.println("Observer 1 state: " + observer1.getObserverState());
        System.out.println("Observer 2 state: " + observer2.getObserverState());
        System.out.println("Observer 3 state: " + observer3.getObserverState());

    }

    public static void pushMethod() {
        System.out.println("Vado a creare un subject a cui vado a fare 3 sottoscrizioni.");
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1", concreteSubject);
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2", concreteSubject);
        ConcreteObserver observer3 = new ConcreteObserver("Observer 3", concreteSubject);
        concreteSubject.attach(observer1);
        concreteSubject.attach(observer2);
        concreteSubject.attach(observer3);

        System.out.println("Vado a cambiare lo stato del subject, questo notificherà tutti gli observer.");
        concreteSubject.setStatePush("State changed!");

        System.out.println("Verifico che tutti gli observer abbiamo recepito il cambio di stato.");
        System.out.println("Observer 1 state: " + observer1.getObserverState());
        System.out.println("Observer 2 state: " + observer2.getObserverState());
        System.out.println("Observer 3 state: " + observer3.getObserverState());

        System.out.println("Ora stacco observer 2 e cambio stato.");
        concreteSubject.detach(observer2);
        concreteSubject.setStatePush("State changed again!");
        System.out.println("Verifico che observer 2 non abbia ricevuto la notifica.");
        System.out.println("Observer 1 state: " + observer1.getObserverState());
        System.out.println("Observer 2 state: " + observer2.getObserverState());
        System.out.println("Observer 3 state: " + observer3.getObserverState());
    }

    public static void changeManagerMethod() {

        System.out.println("Vado a creare un subject a cui vado a fare 3 sottoscrizioni.");
        ConcreteSubject concreteSubject = new ConcreteSubject("Concrete Subject", new SimpleChangeManager());
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1", concreteSubject);
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2", concreteSubject);
        ConcreteObserver observer3 = new ConcreteObserver("Observer 3", concreteSubject);
        concreteSubject.attachByChangeManager(observer1);
        concreteSubject.attachByChangeManager(observer2);
        concreteSubject.attachByChangeManager(observer3);

        System.out.println("Vado a cambiare lo stato del subject, questo notificherà tutti gli observer.");
        concreteSubject.setStateChangeManager("State changed!");

        System.out.println("Verifico che tutti gli observer abbiamo recepito il cambio di stato.");
        System.out.println("Observer 1 state: " + observer1.getObserverState());
        System.out.println("Observer 2 state: " + observer2.getObserverState());
        System.out.println("Observer 3 state: " + observer3.getObserverState());

        System.out.println("Ora stacco observer 2 e cambio stato.");
        concreteSubject.detachByChangeManager(observer2);
        concreteSubject.setStateChangeManager("State changed again!");
        System.out.println("Verifico che observer 2 non abbia ricevuto la notifica.");
        System.out.println("Observer 1 state: " + observer1.getObserverState());
        System.out.println("Observer 2 state: " + observer2.getObserverState());
        System.out.println("Observer 3 state: " + observer3.getObserverState());
    }

    public static void dagChangeManagerMethod() {
        System.out.println("DAG Change Manager con dipendenze tra subject.");

        DAGChangeManager dagManager = new DAGChangeManager();
        ConcreteSubject subjectA = new ConcreteSubject("Subject A", dagManager);
        ConcreteSubject subjectB = new ConcreteSubject("Subject B", dagManager);
        ConcreteSubject subjectC = new ConcreteSubject("Subject C", dagManager);

        // Dipendenze: A -> B, A -> C, B -> C
        dagManager.addDependency(subjectA, subjectB);
        dagManager.addDependency(subjectA, subjectC);
        dagManager.addDependency(subjectB, subjectC);

        // Stati iniziali per evidenziare quali subject vengono notificati e in che ordine.
        subjectB.setState("B ready");
        subjectC.setState("C ready");

        ConcreteObserver observerA = new ConcreteObserver("Observer A", subjectA);
        ConcreteObserver observerB = new ConcreteObserver("Observer B", subjectB);
        ConcreteObserver observerC = new ConcreteObserver("Observer C", subjectC);

        subjectA.attachByChangeManager(observerA);
        subjectB.attachByChangeManager(observerB);
        subjectC.attachByChangeManager(observerC);

        System.out.println("Cambio Subject A: il DAG notifica A, poi B, poi C.");
        subjectA.setStateChangeManager("A changed");

        System.out.println("Observer A state: " + observerA.getObserverState());
        System.out.println("Observer B state: " + observerB.getObserverState());
        System.out.println("Observer C state: " + observerC.getObserverState());
    }

}
