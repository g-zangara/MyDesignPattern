package comportamentale.state;

import comportamentale.state.state.PortaState;

public class Context {

    private PortaState currentState;

    public Context(PortaState initialState) {
        this.currentState = initialState;
    }

    public String getCurrentState() {
        return currentState.toString();
    }

    public void apriPorta(){
        currentState = currentState.handlePortaAperta();
    }

    public void bloccaPorta(){
        currentState = currentState.handlePortaBloccata();
    }

    public void chiudiPorta(){
        currentState = currentState.handlePortaChiusa();
    }

    public void sbloccaPorta(){
        currentState = currentState.handlePortaSbloccata();
    }

}
