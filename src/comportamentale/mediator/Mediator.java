package comportamentale.mediator;

import comportamentale.mediator.componente.Component;

public interface Mediator {
    void notify(Component sender);
}
