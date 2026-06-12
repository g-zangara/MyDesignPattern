package creazionale.singleton;

import java.io.Serial;
import java.io.Serializable;

public final class Singleton  implements Serializable {

    private static Singleton INSTANCE = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    //Per gestione problema in caso di serializzazione/deserializzazione
    @Serial
    private Object readResolve() {
        return getInstance();
    }

}
