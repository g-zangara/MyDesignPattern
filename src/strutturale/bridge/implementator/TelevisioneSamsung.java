package strutturale.bridge.implementator;

public class TelevisioneSamsung implements Televisione {

    @Override
    public void operationImpl() {
        System.out.println("Televisione Samsung!");
    }

}
