package strutturale.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private final Map<String, ConcreteGenericTreeFlyweight> flyweights;

    public FlyweightFactory() {
        this.flyweights = new HashMap<>();
    }

    public GenericTreeFlyweight getFlyweight(String key){
        String normalizedKey = key.toUpperCase();
        return flyweights.computeIfAbsent(normalizedKey, this::buildFlyweight);
    }

    private ConcreteGenericTreeFlyweight buildFlyweight(String key) {
        if(key.equals("PINO")) {
            return new ConcreteGenericTreeFlyweight("Pino", "Verde", "Grande");
        }
        if(key.equals("QUERCIA")) {
            return new ConcreteGenericTreeFlyweight("Quercia", "Marrone", "Media");
        }
        if(key.equals("BETULLA")) {
            return new ConcreteGenericTreeFlyweight("Betulla", "Bianco", "Piccola");
        }
        throw new IllegalArgumentException("Tipo di albero non supportato: " + key);
    }

}
