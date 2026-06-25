package comportamentale.state;

import comportamentale.state.state.PortaStateAperta;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ci troviamo nello stato inziale di porta aperta.");
        Context context = new Context(new PortaStateAperta());
        System.out.println("Stato correte: "+context.getCurrentState());

        System.out.println("Proviamo ad aprirla di nuovo.");
        context.apriPorta();
        System.out.println("Ci troviamo quindi ancora nello stato correte: "+context.getCurrentState());

        System.out.println("Ora vado a bloccarla, ma non posso subito bloccarla se aperta, devo prima chiuderla.");
        context.bloccaPorta();
        context.chiudiPorta();
        context.bloccaPorta();
        System.out.println("Stato correte: "+context.getCurrentState());

        System.out.println("Proviamo ad aprirla di nuovo.");
        context.apriPorta();
        System.out.println("Ci troviamo quindi ancora nello stato correte: "+context.getCurrentState());
        System.out.println("Proviamo a sbloccarla di nuovo.");
        context.sbloccaPorta();
        context.apriPorta();
        context.apriPorta();
        System.out.println("Stato correte: "+context.getCurrentState());

    }
}
