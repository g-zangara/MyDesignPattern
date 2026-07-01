package comportamentale.iterator.aggregator;

import comportamentale.iterator.ConcreteIterator;
import comportamentale.iterator.FilmElement;
import comportamentale.iterator.Iterator;

import java.util.ArrayList;

public class ConcreteAggregator extends AbstractAggregator<FilmElement> {

    private final ArrayList<FilmElement> items;

    public ConcreteAggregator() {
        this.items = new ArrayList<>();
    }

    @Override
    public Iterator<FilmElement> createIterator() {
        return new ConcreteIterator<>(items);
    }

    @Override
    public boolean addItem(FilmElement item) {
        return items.add(item);
    }

    @Override
    public boolean removeItem(FilmElement item) {
        return items.remove(item);
    }

}
