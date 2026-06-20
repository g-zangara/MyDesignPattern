package comportamentale.command.invoker;

import comportamentale.command.command.OrdineCommand;

import java.util.Objects;

public class CameriereInvoker {

    private final String name;
    private String ordine;

    public CameriereInvoker(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void takeOrder(String ordine) {
        System.out.println("Il cameriere " + this.name + " ha preso l'ordine " + ordine);
        this.ordine = ordine;
    }

    public void handle(OrdineCommand cmd) {
        Objects.requireNonNull(cmd, "Il camerire deve sapere chi prende in carico l'ordine!");
        Objects.requireNonNull(this.ordine, "Ho bisogno di sapere l'ordine da inviare.");
        cmd.setOrdine(this.ordine);
        System.out.println("Il cameriere " + this.name + " ha preso l'ordine " + cmd.getOrdine() + " e lo ha inviato al cuoco: " + cmd.getCuocoNameByOrder());
        cmd.execute();
    }

}
