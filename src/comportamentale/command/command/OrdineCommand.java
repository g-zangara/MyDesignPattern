package comportamentale.command.command;

import comportamentale.command.receiver.CuocoReceiver;

public class OrdineCommand implements Command {

    private final CuocoReceiver cuoco;
    private String ordine;

    public OrdineCommand(CuocoReceiver cuoco) {
        this.cuoco = cuoco;
    }

    public void setOrdine(String ordine) {
        this.ordine = ordine;
    }

    public String getCuocoNameByOrder() {
        return this.cuoco.getCuocoName();
    }

    public String getOrdine() {
        return this.ordine;
    }

    @Override
    public void execute() {
        cuoco.action(ordine);
    }

}
