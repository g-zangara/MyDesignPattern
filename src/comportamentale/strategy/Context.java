package comportamentale.strategy;

import comportamentale.strategy.strategy.VeicoloStrategy;

import java.util.Objects;

public class Context {

    private VeicoloStrategy strategy;

    public Context() {
    }

    public void setStrategy(VeicoloStrategy strategy) {
        this.strategy = strategy;
    }

    public void calcolaPercorsoFee(){
        if(Objects.isNull(strategy)){
            throw new IllegalArgumentException("Decidi prima con quale mezzo di trasporto andare!");
        }
        strategy.execute();
    }

}
