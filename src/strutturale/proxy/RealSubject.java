package strutturale.proxy;

public class RealSubject implements SubjectInterface {

    @Override
    public void request() {
        System.out.println("RealSubject: Gestisco io la richiesta.");
    }

}
