package creazionale.singleton;

public final class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    //Per gestione problema in caso di serializzazione/deserializzazione
    private Object readResolve() {
        return getInstance();
    }

}
