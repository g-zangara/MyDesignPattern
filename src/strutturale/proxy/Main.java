package strutturale.proxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creazione del servizio...");
        SubjectInterface service = new Proxy();

        System.out.println("Prima richiesta (creazione lazy del RealSubject):");
        service.request();

        System.out.println("Seconda richiesta (riuso del RealSubject esistente):");
        service.request();

    }
}
