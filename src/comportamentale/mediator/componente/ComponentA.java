package comportamentale.mediator.componente;

import comportamentale.mediator.Mediator;

public class ComponentA extends Component{

    public ComponentA(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void operation(String message) {
        System.out.println(getName() + " esegue operazione: " + message);
    }

}
