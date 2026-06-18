package comportamentale.observer.observer;

import comportamentale.observer.subject.Subject;

public class ConcreteObserver implements Observer {

    private String observerState;
    private final String name;
    private final Subject subject;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Observer " + name + " has been notified.");
        this.observerState = subject.getState();
    }

    @Override
    public void update(Subject pushSubject) {
        System.out.println("Observer " + name + " has been notified.");
        this.observerState = pushSubject.getState();
    }

    public String getObserverState() {
        return observerState;
    }

    public String getName() {
        return name;
    }

}
