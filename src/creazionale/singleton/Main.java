package creazionale.singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("Vado a creare due sigleton, e poi verifico se sono uguali (uso la stessa istanza):");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Sono stessa istanza? "+s1.equals(s2));

        System.out.println("Vado a creare due sigleton, questa volta uso enum:");
        EnumSingleton es1 = EnumSingleton.INSTANCE;
        EnumSingleton es2 = EnumSingleton.INSTANCE;
        System.out.println("Sono stessa istanza? "+es1.equals(es2));
    }
}
