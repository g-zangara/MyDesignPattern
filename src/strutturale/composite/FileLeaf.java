package strutturale.composite;

public class FileLeaf implements Component{

    private final String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Esecuzione operazione su file: " + this.toString());
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Non posso mettere un file dentro un file.");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Non posso rimuovere un file da un file.");
    }

    @Override
    public Component getComponent(int index) {
        throw new UnsupportedOperationException("Il file è una foglia, non ha sotto componenti.");
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
