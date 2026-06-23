package comportamentale.strategy.strategy;

public class AutoVeicoloStrategy implements VeicoloStrategy {

    @Override
    public void execute() {
        System.out.println("Andare in auto ti costerà 40 euro di pedaggio, 100 euro di carburante, totale 140 euro.");
    }

}
