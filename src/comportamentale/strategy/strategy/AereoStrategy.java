package comportamentale.strategy.strategy;

public class AereoStrategy implements VeicoloStrategy {

    @Override
    public void execute() {
        System.out.println("Andare in aereo ti costerà 70 euro.");
    }

}
