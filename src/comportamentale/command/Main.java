package comportamentale.command;

import comportamentale.command.command.OrdineCommand;
import comportamentale.command.invoker.CameriereInvoker;
import comportamentale.command.receiver.CuocoReceiver;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mi reco nel ristorante dello chef pinco pallino.");
        CuocoReceiver cuoco = new CuocoReceiver("Pinco Pallino");

        System.out.println("Arriva il camere che mi chiede cosa voglio ordinare.");
        CameriereInvoker cameriere = new CameriereInvoker("Mario");
        System.out.println("Dico al cameriere che voglio ordinare una pizza margherita.");
        cameriere.takeOrder("Pizza Margherita");
        cameriere.handle(new OrdineCommand(cuoco));

    }
}
