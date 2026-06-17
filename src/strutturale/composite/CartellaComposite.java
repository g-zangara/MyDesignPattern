package strutturale.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CartellaComposite implements Component {

    private final String nome;
    private final List<Component> componenti;

    public CartellaComposite(String nome) {
        this.nome = nome;
        this.componenti = new ArrayList<>();
    }

    @Override
    public void operation() {
        System.out.println("Esecuzione operazione su cartella: " + this.nome);
        for (Component componente : componenti) {
            componente.operation();
        }
    }

    @Override
    public void add(Component component) {
        Objects.requireNonNull(component, "Impossibile aggiungere un componente nullo alla cartella.");
        componenti.add(component);
    }

    @Override
    public void remove(Component component) {
        Objects.requireNonNull(component, "Impossibile rimuovere un componente nullo dalla cartella.");
        componenti.remove(component);
    }

    @Override
    public Component getComponent(int index) {
        if (index < 0 || index >= componenti.size()) {
            throw new IndexOutOfBoundsException("Indice " + index + " non valido per la cartella '" + nome + "'. Elementi presenti: " + componenti.size());
        }
        return componenti.get(index);
    }

    public String getNome(){
        return this.nome;
    }
}
