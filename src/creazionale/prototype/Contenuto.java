package creazionale.prototype;

import java.util.Arrays;

public class Contenuto implements Prototype<Contenuto> {
    private String[] domandeQuiz;
    private String[] risposteQuiz;

    public Contenuto(String[] domandeQuiz, String[] risposteQuiz) {
        this.domandeQuiz = domandeQuiz;
        this.risposteQuiz = risposteQuiz;
    }

    public String[] getDomandeQuiz() {
        return domandeQuiz;
    }

    public String[] getRisposteQuiz() {
        return risposteQuiz;
    }

    public void setDomandeQuiz(String[] domandeQuiz) {
        this.domandeQuiz = domandeQuiz;
    }

    public void setRisposteQuiz(String[] risposteQuiz) {
        this.risposteQuiz = risposteQuiz;
    }

    public void aggiornaRisposta(int indice, String nuovaRisposta) {
        risposteQuiz[indice] = nuovaRisposta;
    }

    @Override
    public Contenuto copiaShallow() {
        return new Contenuto(domandeQuiz, risposteQuiz);
    }

    @Override
    public Contenuto copiaDeep() {
        return new Contenuto(domandeQuiz.clone(), risposteQuiz.clone());
    }

    @Override
    public String toString() {
        return "{" +
                "domandeQuiz=" + Arrays.toString(domandeQuiz) +
                ", risposteQuiz=" + Arrays.toString(risposteQuiz) +
                '}';
    }
}
