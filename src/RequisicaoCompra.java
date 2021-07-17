import java.time.LocalDate;

public class RequisicaoCompra {
    private Integer idReqCompra;
    private java.time.LocalDate dataReqCompra;
    private java.lang.String estado;
    private Encomenda encomenda;

    public RequisicaoCompra(Integer idReqCompra, LocalDate dataReqCompra, String estado, Encomenda encomenda) {
        this.idReqCompra = idReqCompra;
        this.dataReqCompra = dataReqCompra;
        this.estado = estado;
        this.encomenda = encomenda;
    }

    public Integer getIdReqCompra() {
        return idReqCompra;
    }

    public LocalDate getDataReqCompra() {
        return dataReqCompra;
    }

    public String getEstado() {
        return estado;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }
}
