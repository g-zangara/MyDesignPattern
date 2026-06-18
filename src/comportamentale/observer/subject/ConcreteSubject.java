package comportamentale.observer.subject;

import comportamentale.observer.manager.ChangeManager;
import comportamentale.observer.observer.Observer;

public class ConcreteSubject extends Subject {

    private String state;

    public ConcreteSubject() {
        super();
    }

    public ConcreteSubject(String name) {
        super(name);
    }

    public ConcreteSubject(String name, ChangeManager changeManager) {
        super(name, changeManager);
    }

    @Override
    public void attachByChangeManager(Observer observer) {
        changeManager.register(this, observer);
    }

    @Override
    public void detachByChangeManager(Observer observer) {
        changeManager.unregister(this, observer);
    }

    public String getState() {
        return state;
    }

    @Override
    public void setState(String newState) {
        this.state = newState;
        notifyObservers();
    }

    @Override
    public void setStatePush(String newState) {
        this.state = newState;
        notifyObserversPush();
    }

    @Override
    public void setStateChangeManager(String newState) {
        this.state = newState;
        if (changeManager != null) {
            changeManager.notifyObserversByChangeManager(this);
        }
    }


}
