package comportamentale.iterator.aggregator;

public abstract class AbstractAggregator<T> implements Aggregator<T> {

    public abstract boolean addItem(T item);
    public abstract boolean removeItem(T item);

}
