package comportamentale.iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ConcreteIterator<T> implements Iterator<T> {

    private final ArrayList<T> items;
    private int position = 0;

    public ConcreteIterator(ArrayList<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public boolean next() {
        if (this.hasNext()) {
            position++;
            return true;
        }
        return false;
    }

    @Override
    public T currentItem() {
        if (!hasNext()) {
            throw new NoSuchElementException("Nessun elemento disponibile nella posizione corrente.");
        }
        return items.get(position);
    }

}
