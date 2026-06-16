package strutturale.bridge.implementator;

public class TelevisioneSony implements Televisione {

    @Override
    public void operationImpl() {
        System.out.println("Televisione Sony!");
    }

}
