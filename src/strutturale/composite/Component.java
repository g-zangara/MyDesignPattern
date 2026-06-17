package strutturale.composite;

public interface Component {
    void operation();
    void add(Component component);
    void remove(Component component);
    Component getComponent(int index);
}
