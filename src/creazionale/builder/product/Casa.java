package creazionale.builder.product;

public class Casa implements Product {

    private int numeroStanze;
    private int numeroBagni;
    private int numeroPiani;
    private int superficieMq;
    private String tipoMaterialePareti;
    private String tipoTetto;
    private int numeroFinestre;
    private int numeroPorte;

    public void setNumeroStanze(int numeroStanze) {
        this.numeroStanze = numeroStanze;
    }

    public void setNumeroBagni(int numeroBagni) {
        this.numeroBagni = numeroBagni;
    }

    public void setNumeroPiani(int numeroPiani) {
        this.numeroPiani = numeroPiani;
    }

    public void setSuperficieMq(int superficieMq) {
        this.superficieMq = superficieMq;
    }

    public void setTipoMaterialePareti(String tipoMaterialePareti) {
        this.tipoMaterialePareti = tipoMaterialePareti;
    }

    public void setTipoTetto(String tipoTetto) {
        this.tipoTetto = tipoTetto;
    }

    public void setNumeroFinestre(int numeroFinestre) {
        this.numeroFinestre = numeroFinestre;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    @Override
    public String toString() {
        return "{" +
                "numeroStanze=" + numeroStanze +
                ", numeroBagni=" + numeroBagni +
                ", numeroPiani=" + numeroPiani +
                ", superficieMq=" + superficieMq +
                ", tipoMaterialePareti='" + tipoMaterialePareti + '\'' +
                ", tipoTetto='" + tipoTetto + '\'' +
                ", numeroFinestre=" + numeroFinestre +
                ", numeroPorte=" + numeroPorte +
                '}';
    }

}
