package comportamentale.command.receiver;

public class CuocoReceiver {

    private final String cuocoName;

    public CuocoReceiver(String cuocoName) {
        this.cuocoName = cuocoName;
    }

    public String getCuocoName() {
        return this.cuocoName;
    }

    public void action(String plate){
        System.out.println("Il cuoco ha ricevuto l'ordine e sta preparando il piatto: " + plate);
    }

}
