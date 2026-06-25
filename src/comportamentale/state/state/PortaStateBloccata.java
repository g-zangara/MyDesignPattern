package comportamentale.state.state;

public class PortaStateBloccata implements PortaState{

    @Override
    public PortaState handlePortaAperta() {
        System.out.println("Prima devi sbloccare la porta.");
        return this;
    }

    @Override
    public PortaState handlePortaBloccata() {
        System.out.println("La porta è già bloccata.");
        return this;
    }

    @Override
    public PortaState handlePortaChiusa() {
        System.out.println("Non puoi chiudere la porta mentre è bloccata.");
        return this;
    }

    @Override
    public PortaState handlePortaSbloccata() {
        System.out.println("La porta è stata sbloccata.");
        return new PortaStateSbloccata();
    }

    @Override
    public String toString() {
        return "PortaStateBloccata";
    }

}
