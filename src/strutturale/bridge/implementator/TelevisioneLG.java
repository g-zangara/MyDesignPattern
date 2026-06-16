package strutturale.bridge.implementator;

public class TelevisioneLG implements Televisione {

    @Override
    public void operationImpl() {
        System.out.println("Televisione LG!");
    }

}
