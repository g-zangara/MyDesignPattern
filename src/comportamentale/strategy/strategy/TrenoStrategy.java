package comportamentale.strategy.strategy;

public class TrenoStrategy implements VeicoloStrategy {

    @Override
    public void execute() {
        System.out.println("Andare in treno ti costerà 100 euro.");
    }

}
