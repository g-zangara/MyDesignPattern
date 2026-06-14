package strutturale.adapter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calcolo area e perimetro di un triangolo usando adpter basato sulle classi.");
        System.out.println("Definisco un triangolo con i lati 3, 4 e 5.");
        TriangleAdpterClass triangleAdpterClass = new TriangleAdpterClass(3, 4, 5);
        System.out.println("Area: " + triangleAdpterClass.area());
        System.out.println("Perimetro: " + triangleAdpterClass.perimetro());

        System.out.println("Calcolo area e perimetro di un triangolo usando adpter basato sugli oggetti.");
        System.out.println("Definisco un triangolo con i lati 6, 8 e 10.");
        TriangleAdpterObject triangleAdpterObject = new TriangleAdpterObject(6, 8, 10);
        System.out.println("Area: " + triangleAdpterObject.area());
        System.out.println("Perimetro: " + triangleAdpterObject.perimetro());

    }
}
