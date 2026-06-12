package strutturale.proxy;

public class Proxy implements SubjectInterface {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            System.out.println("Proxy: creo RealSubject solo al primo utilizzo.");
            realSubject = new RealSubject();
        }

        System.out.println("Proxy: inoltro la richiesta al RealSubject.");
        realSubject.request();
    }

}
