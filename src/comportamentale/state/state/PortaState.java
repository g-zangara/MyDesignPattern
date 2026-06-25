package comportamentale.state.state;

public interface PortaState {
    PortaState handlePortaAperta();
    PortaState handlePortaBloccata();
    PortaState handlePortaChiusa();
    PortaState handlePortaSbloccata();
}
