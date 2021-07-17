public class Coima {
    private Integer idCoima;
    private Float valorCoima;
    private Devolucao devolucao;

    public Coima(Integer idCoima, Float valorCoima, Devolucao devolucao) {
        this.idCoima = idCoima;
        this.valorCoima = valorCoima;
        this.devolucao = devolucao;
    }

    public Integer getIdCoima() {
        return idCoima;
    }

    public Float getValorCoima() {
        return valorCoima;
    }

    public Devolucao getDevolucao() {
        return devolucao;
    }

    public void setValorCoima(Float valorCoima) {
        this.valorCoima = valorCoima;
    }
}
