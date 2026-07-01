package comportamentale.iterator;

public class FilmElement {
    private String name;
    private String formatoVideo;
    private String regista;
    private String durata;
    private String genere;

    public FilmElement(String name, String formatoVideo, String regista, String durata, String genere) {
        this.name = name;
        this.formatoVideo = formatoVideo;
        this.regista = regista;
        this.durata = durata;
        this.genere = genere;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormatoVideo() {
        return formatoVideo;
    }

    public void setFormatoVideo(String formatoVideo) {
        this.formatoVideo = formatoVideo;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "FilmElement{" +
                "name='" + name + '\'' +
                ", formatoVideo='" + formatoVideo + '\'' +
                ", regista='" + regista + '\'' +
                ", durata='" + durata + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }

}
