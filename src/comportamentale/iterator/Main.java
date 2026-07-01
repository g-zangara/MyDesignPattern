package comportamentale.iterator;

import comportamentale.iterator.aggregator.ConcreteAggregator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Voglio scorrere una collezione di film. Questi film sono in vari formati, tutti aggregati");
        FilmElement film1 = new FilmElement("Il Padrino", "DVD", "Francis Ford Coppola", "175 min", "Drammatico");
        FilmElement film2 = new FilmElement("Inception", "Blu-ray", "Christopher Nolan", "148 min", "Fantascienza");
        FilmElement film3 = new FilmElement("La Vita è Bella", "DVD", "Roberto Benigni", "116 min", "Commedia");
        FilmElement film4 = new FilmElement("Il Signore degli Anelli", "Blu-ray", "Peter Jackson", "201 min", "Fantasy");
        FilmElement film5 = new FilmElement("Pulp Fiction", "DVD", "Quentin Tarantino", "154 min", "Thriller");

        System.out.println("Creo un aggregatore di film e aggiungo i film alla collezione");
        ConcreteAggregator filmAggregator = new ConcreteAggregator();
        filmAggregator.addItem(film1);
        filmAggregator.addItem(film2);
        filmAggregator.addItem(film3);
        filmAggregator.addItem(film4);
        filmAggregator.addItem(film5);

        System.out.println("Creo un iteratore per scorrere la collezione di film");
        Iterator<FilmElement> filmIterator = filmAggregator.createIterator();

        while (filmIterator.hasNext()) {
            FilmElement film = filmIterator.currentItem();
            System.out.println(film.toString());
            filmIterator.next();
        }

    }
}
