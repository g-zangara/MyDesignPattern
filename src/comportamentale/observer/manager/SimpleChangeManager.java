package comportamentale.observer.manager;

import comportamentale.observer.observer.Observer;
import comportamentale.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class SimpleChangeManager implements ChangeManager {

    private final List<Subject> subjects;
    private final List<Observer> observers;

    public SimpleChangeManager() {
        this.subjects = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Subject subject, Observer observer) {
        subjects.add(subject);
        observers.add(observer);
    }

    @Override
    public void unregister(Subject subject, Observer observer) {
        subjects.remove(subject);
        observers.remove(observer);
    }

    @Override
    public void notifyObserversByChangeManager(Subject changedSubject) {
        for (Subject subject : subjects) {
            if (subject.equals(changedSubject)) {
                for (Observer observer : observers) {
                    observer.update(subject);
                }
            }
        }
    }

}
