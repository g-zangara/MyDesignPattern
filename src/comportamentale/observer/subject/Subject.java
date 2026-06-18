package comportamentale.observer.subject;

import comportamentale.observer.manager.ChangeManager;
import comportamentale.observer.manager.SimpleChangeManager;
import comportamentale.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private final String name;
    protected List<Observer> observers;
    protected ChangeManager changeManager;

    public Subject() {
        this.name = "Default subject for push and pull pattern.";
        this.observers = new ArrayList<>();
    }

    //custom subject for many to many request
    public Subject(String name) {
        this(name, new SimpleChangeManager());
    }

    public Subject(String name, ChangeManager changeManager) {
        this.name = name;
        this.observers = new ArrayList<>();
        this.changeManager = changeManager;
    }

    public String getName() {
        return name;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //change manager attach/detach method
    public abstract void attachByChangeManager(Observer observer);

    public abstract void detachByChangeManager(Observer observer);

    //pull method
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    //push method
    public void notifyObserversPush() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract String getState();

    //set for pull method
    public abstract void setState(String state);

    //set for push method
    public abstract void setStatePush(String state);

    //set for change manager (notifica tramite manager)
    public abstract void setStateChangeManager(String state);

}
