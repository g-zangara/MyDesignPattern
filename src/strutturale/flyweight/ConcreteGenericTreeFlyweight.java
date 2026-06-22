package strutturale.flyweight;

public class ConcreteGenericTreeFlyweight implements GenericTreeFlyweight {

    private final String intrinsicStateTreeType;
    private final String intrinsicStateTreeColor;
    private final String intrinsicStateSize;

    public ConcreteGenericTreeFlyweight(String type, String color, String size) {
        this.intrinsicStateTreeType = type;
        this.intrinsicStateTreeColor = color;
        this.intrinsicStateSize = size;
    }

    @Override
    public String operation(String extrinsicStateX, String extrinsicStateY) {
        return "Tree di tipo " + intrinsicStateTreeType
                + ", colore " + intrinsicStateTreeColor
                + ", dimensione " + intrinsicStateSize
                + ", posizioneX " + extrinsicStateX
                + ", posizioneY " + extrinsicStateY + ".";
    }

    @Override
    public String toString() {
        return "Tree di tipo " + intrinsicStateTreeType
                + ", colore " + intrinsicStateTreeColor
                + ", dimensione " + intrinsicStateSize + ".";
    }

}
