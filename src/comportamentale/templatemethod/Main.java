package comportamentale.templatemethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Voglio preparare una bevanda, prima preparo il caffè:");
        Caffe caffe = new Caffe();
        caffe.preparaBevandaTemplateMethod(null);
        System.out.println("Adesso preparo il tè, e ci aggiungo il latte:");
        Tea tea = new Tea();
        tea.preparaBevandaTemplateMethod("Latte");
        System.out.println("Adesso preparo la cioccolata, con aggiunta di cannella:");
        Cioccolata cioccolata = new Cioccolata();
        cioccolata.preparaBevandaTemplateMethod("Cannella");
        System.out.println("Infine preparo la cioccolata senza ingredienti extra:");
        cioccolata.preparaBevandaTemplateMethod(null);
    }
}
