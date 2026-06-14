package strutturale.adapter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calcolo area e perimetro di un triangolo usando adpter basato sulle classi.");
        System.out.println("Definisco un triangolo con i lati 3, 4 e 5.");
        TriangleAdapterClass triangleAdapterClass = new TriangleAdapterClass(3, 4, 5);
        System.out.println("Area: " + triangleAdapterClass.area());
        System.out.println("Perimetro: " + triangleAdapterClass.perimetro());

        System.out.println("Calcolo area e perimetro di un triangolo usando adpter basato sugli oggetti.");
        System.out.println("Definisco un triangolo con i lati 6, 8 e 10.");
        TriangleAdapterObject triangleAdapterObject = new TriangleAdapterObject(6, 8, 10);
        System.out.println("Area: " + triangleAdapterObject.area());
        System.out.println("Perimetro: " + triangleAdapterObject.perimetro());

        System.out.println("Calcolo area e perimetro di un triangolo non valido.");
        try{
            System.out.println("Definisco un triangolo con i lati 25, 16 e 9.");
            TriangleAdapterObject errorTriangle = new TriangleAdapterObject(25, 16, 9);
            System.out.println("Area: " + triangleAdapterObject.area());
            System.out.println("Perimetro: " + triangleAdapterObject.perimetro());
        }catch (Exception e){
            System.out.println("Errore: " + e.getMessage());
        }

    }
}
