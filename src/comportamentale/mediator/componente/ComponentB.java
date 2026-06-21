package comportamentale.mediator.componente;

import comportamentale.mediator.Mediator;

public class ComponentB extends Component{

    public ComponentB(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void operation(String message) {
        System.out.println(getName() + " esegue operazione: " + message);
    }

}
