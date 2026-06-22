package comportamentale.memento;

public class Originator {

    private String state;

    public Originator(String state){
        this.state = state;
    }

    public Memento saveMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
       this.state = memento.getState();
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

}
