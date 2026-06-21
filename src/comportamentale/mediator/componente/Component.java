package comportamentale.mediator.componente;

import comportamentale.mediator.Mediator;

public abstract class Component {

    protected final Mediator mediator;
    private final String name;

    public Component(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return this.name;
    }

    public void send(String message) {
        System.out.println(name + " invia messaggio: " + message);
        mediator.notify(this);
    }

    public abstract  void operation(String message);

}
