package creazionale.singleton;

import java.io.*;

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


        System.out.println("Ora vado a serializzare un singleton e a deserializzarlo.");
        //Problema della serializzazione
        Singleton s4 = Singleton.getInstance();
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"))) {
            out.writeObject(s4);
        } catch (Exception e) {
            System.out.println("Errore durante la serializzazione: " + e.getMessage());
        }

        Singleton s5 = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"))) {
            s5 = (Singleton) in.readObject();
        } catch (Exception e) {
            System.out.println("Errore durante la deserializzazione: " + e.getMessage());
        }

        //Commentando il readResolver di Singleton ottengo false
        System.out.println("Sono ancora la stessa istanza? "+s4.equals(s5));

        System.out.println("Ora vado a serializzare un singleton e a deserializzarlo, ma uso enum.");
        EnumSingleton es4 = EnumSingleton.INSTANCE;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("enumsingleton.ser"))) {
            out.writeObject(es4);
        } catch (Exception e) {
            System.out.println("Errore durante la serializzazione: " + e.getMessage());
        }

        EnumSingleton es5 = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("enumsingleton.ser"))) {
            es5 = (EnumSingleton) in.readObject();
        } catch (Exception e) {
            System.out.println("Errore durante la deserializzazione: " + e.getMessage());
        }

        System.out.println("Sono ancora la stessa istanza? "+es4.equals(es5));
    }
}
