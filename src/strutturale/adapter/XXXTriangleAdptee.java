package strutturale.adapter;

public class XXXTriangleAdptee {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public XXXTriangleAdptee(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateSurface() {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Non è un triangolo valido");
        }

        double s = (sideA + sideB + sideC) / 2;

        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double calculateBoundaryLength() {
        return sideA + sideB + sideC;
    }

}
