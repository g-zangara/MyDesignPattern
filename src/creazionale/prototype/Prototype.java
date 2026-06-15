package creazionale.prototype;

public interface Prototype<T> {

    T copiaShallow();
    T copiaDeep();

}
