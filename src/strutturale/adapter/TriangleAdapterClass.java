package strutturale.adapter;

public class TriangleAdapterClass extends XXXTriangleAdptee implements Figura2D {

    public TriangleAdapterClass(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double area() {
        return this.calculateSurface();
    }

    @Override
    public double perimetro() {
        return this.calculateBoundaryLength();
    }

}
