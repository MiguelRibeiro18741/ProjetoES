import java.time.LocalDate;

public class Requisicao {
    private Integer idReq;
    private java.time.LocalDate dataHoraReq;
    private Copia copia;
    private Utilizador utilizador;

    public Requisicao(Integer idReq, LocalDate dataHoraReq, Copia copia, Utilizador utilizador) {
        this.idReq = idReq;
        this.dataHoraReq = dataHoraReq;
        this.copia = copia;
        this.utilizador = utilizador;
    }

    public Integer getIdReq() {
        return idReq;
    }

    public LocalDate getDataHoraReq() {
        return dataHoraReq;
    }

    public Copia getCopia() {
        return copia;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setDataHoraReq(LocalDate dataHoraReq) {
        this.dataHoraReq = dataHoraReq;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
}
