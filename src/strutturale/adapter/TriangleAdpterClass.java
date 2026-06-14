package strutturale.adapter;

public class TriangleAdpterClass extends XXXTriangleAdptee implements Figura2D {

    public TriangleAdpterClass(double sideA, double sideB, double sideC) {
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
