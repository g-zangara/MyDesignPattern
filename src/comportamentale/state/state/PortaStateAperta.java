package comportamentale.state.state;

public class PortaStateAperta implements PortaState {

    @Override
    public PortaState handlePortaAperta() {
        System.out.println("La porta è già aperta.");
        return this;
    }

    @Override
    public PortaState handlePortaBloccata() {
        System.out.println("Non puoi bloccare la porta mentre è aperta.");
        return this;
    }

    @Override
    public PortaState handlePortaChiusa() {
        System.out.println("La porta è stata chiusa.");
        return new PortaStateChiusa();
    }

    @Override
    public PortaState handlePortaSbloccata() {
        System.out.println("La porta è già sbloccata, se è aperta.");
        return this;
    }

    @Override
    public String toString() {
        return "PortaStateAperta";
    }

}
