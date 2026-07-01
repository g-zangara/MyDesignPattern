package comportamentale.iterator.aggregator;

import comportamentale.iterator.Iterator;

public interface Aggregator<T> {
    Iterator<T> createIterator();
}
