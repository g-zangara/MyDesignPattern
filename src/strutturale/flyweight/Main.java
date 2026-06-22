package strutturale.flyweight;

public class Main {
    public static void main(String[] args) {

        System.out.println("Provo subito a ottenere un oggetto di tipo betulla.");
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        GenericTreeFlyweight betullaTree = flyweightFactory.getFlyweight("betulla");
        System.out.println("Provo a ottenere un oggetto di tipo pino.");
        GenericTreeFlyweight pinoTree = flyweightFactory.getFlyweight("pino");

        System.out.println("Uso stato estrinseco diverso per il rendering.");
        System.out.println(betullaTree.operation("10", "20"));
        System.out.println(pinoTree.operation("30", "40"));

        System.out.println("Richiedo gli stessi flyweight e verifico che siano condivisi.");
        GenericTreeFlyweight betullaTree2 = flyweightFactory.getFlyweight("betulla");
        GenericTreeFlyweight pinoTree2 = flyweightFactory.getFlyweight("pino");

        System.out.println("betullaTree e betullaTree2 sono lo stesso oggetto? " + (betullaTree == betullaTree2));
        System.out.println("pinoTree e pinoTree2 sono lo stesso oggetto? " + (pinoTree == pinoTree2));

        System.out.println("Ri-render con nuove posizioni (stato estrinseco) senza mutare il flyweight:");
        System.out.println(betullaTree2.operation("20", "40"));
        System.out.println(pinoTree2.operation("70", "20"));
        System.out.println("Stato intrinseco dei flyweight:");
        System.out.println(betullaTree);
        System.out.println(pinoTree);

    }
}
