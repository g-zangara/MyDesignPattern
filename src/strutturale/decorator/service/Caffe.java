package strutturale.decorator.service;

public class Caffe implements Bevanda{
    @Override
    public String getNome() {
        return "Caffe";
    }

    @Override
    public double getCosto() {
        return 1.0;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getCosto() + " euro";
    }
}
