package comportamentale.iterator;

public interface Iterator<T> {
    boolean hasNext();
    boolean next();
    T currentItem();
}
