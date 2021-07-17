import java.time.LocalDate;

public class PropostaAquisicao {
    private Integer idProposta;
    private java.time.LocalDate dataProposta;
    private java.lang.String tipoProposta;
    private RequisicaoCompraLivro requisicaoCompraLivro;

    public PropostaAquisicao(Integer idProposta, LocalDate dataProposta, String tipoProposta, RequisicaoCompraLivro requisicaoCompraLivro) {
        this.idProposta = idProposta;
        this.dataProposta = dataProposta;
        this.tipoProposta = tipoProposta;
        this.requisicaoCompraLivro = requisicaoCompraLivro;
    }

    public Integer getIdProposta() {
        return idProposta;
    }

    public LocalDate getDataProposta() {
        return dataProposta;
    }

    public String getTipoProposta() {
        return tipoProposta;
    }

    public RequisicaoCompraLivro getRequisicaoCompraLivro() {
        return requisicaoCompraLivro;
    }

    public void setTipoProposta(String tipoProposta) {
        this.tipoProposta = tipoProposta;
    }

    public void setRequisicaoCompraLivro(RequisicaoCompraLivro requisicaoCompraLivro) {
        this.requisicaoCompraLivro = requisicaoCompraLivro;
    }
}
