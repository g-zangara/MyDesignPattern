package comportamentale.strategy;

import comportamentale.strategy.strategy.AereoStrategy;
import comportamentale.strategy.strategy.AutoVeicoloStrategy;
import comportamentale.strategy.strategy.TrenoStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Voglio andare da Lamezia a Milano, e voglio calcolare il costo del viaggio in base al mezzo di trasporto scelto.");
        Context context = new Context();
        System.out.println("Se scelgo di andare in auto:");
        context.setStrategy(new AutoVeicoloStrategy());
        context.calcolaPercorsoFee();
        System.out.println("Se scelgo di andare in treno:");
        context.setStrategy(new TrenoStrategy());
        context.calcolaPercorsoFee();
        System.out.println("Se scelgo di andare in aereo:");
        context.setStrategy(new AereoStrategy());
        context.calcolaPercorsoFee();
    }
}
