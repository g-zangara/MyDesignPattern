package creazionale.prototype;

public class Fotocopiatrice {

    public Foglio faiUnaCopiaShallow(Prototype<Foglio> originale) {
        return originale.copiaShallow();
    }

    public Foglio faiUnaCopiaDeep(Prototype<Foglio> originale) {
        return originale.copiaDeep();
    }

}
