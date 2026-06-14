package strutturale.adapter;

public class TriangleAdpterObject implements Figura2D {

    private final XXXTriangleAdptee triangleAdptee;

    public TriangleAdpterObject(double latoA, double latoB, double latoC) {
        this.triangleAdptee = new XXXTriangleAdptee(latoA, latoB, latoC);
    }

    @Override
    public double area() {
        return triangleAdptee.calculateSurface();
    }

    @Override
    public double perimetro() {
        return triangleAdptee.calculateBoundaryLength();
    }

}
