package comportamentale.observer.manager;

import comportamentale.observer.observer.Observer;
import comportamentale.observer.subject.Subject;

public interface ChangeManager {

    void register(Subject subject, Observer observer);

    void unregister(Subject subject, Observer observer);

    void notifyObserversByChangeManager(Subject changedSubject);

}
