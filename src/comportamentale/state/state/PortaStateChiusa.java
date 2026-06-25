package comportamentale.state.state;

public class PortaStateChiusa implements PortaState {

    @Override
    public PortaState handlePortaAperta() {
        System.out.println("La porta è stata aperta.");
        return new PortaStateAperta();
    }

    @Override
    public PortaState handlePortaBloccata() {
        System.out.println("La porta è stata bloccata.");
        return new PortaStateBloccata();
    }

    @Override
    public PortaState handlePortaChiusa() {
        System.out.println("La porta è già chiusa.");
        return this;
    }

    @Override
    public PortaState handlePortaSbloccata() {
        System.out.println("La porta è già sbloccata.");
        return this;
    }

    @Override
    public String toString() {
        return "PortaStateChiusa";
    }

}
