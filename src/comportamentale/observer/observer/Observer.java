package comportamentale.observer.observer;

import comportamentale.observer.subject.Subject;

public interface Observer {
    void update();
    void update(Subject subject);
}
