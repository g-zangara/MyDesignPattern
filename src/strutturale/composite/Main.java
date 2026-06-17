package strutturale.composite;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creazione delle cartelle A e B, e creazione dei file A,B,C");
        CartellaComposite compositeA = new CartellaComposite("Cartella A");
        CartellaComposite compositeB = new CartellaComposite("Cartella B");
        FileLeaf fileLeafA = new FileLeaf("File A");
        FileLeaf fileLeafB = new FileLeaf("File B");
        FileLeaf fileLeafC = new FileLeaf("File C");
        System.out.println("Fatto.");

        System.out.println("Sto aggiungendo alla cartella A, la cartella B (con dentro i file A e B) e il file C");
        compositeB.add(fileLeafA);
        compositeB.add(fileLeafB);
        compositeA.add(compositeB);
        compositeA.add(fileLeafC);
        System.out.println("Fatto.");

        System.out.println("Vado ad esporare adesso la cartella A per vedere se trovo all'interno tutti i file che ho aggiunto");
        compositeA.operation();
        System.out.println("Fatto.");

        System.out.println("Vado ora a vedere il file B");
        compositeB.getComponent(1).operation();
        System.out.println("Fatto.");

        System.out.println("Non mi serve più il file B, lo rimuovo");
        compositeB.remove(fileLeafB);
        System.out.println("Fatto.");

        System.out.println("Esploro nuovamente la gerarchia per vedere se il file è stato effettivamente rimosso");
        compositeA.operation();
        System.out.println("Fatto.");

        //Forzo errore
        try {
            System.out.println("Provo ora ad aggiungere un file dentro un file");
            fileLeafA.add(fileLeafB);
            System.out.println("Fine.");
        } catch (UnsupportedOperationException e) {
            System.out.println("Errore: " + e.getMessage());
        }

    }
}
