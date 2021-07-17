import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra{
    private PropostaAquisicao propostaAquisicao;

    public RequisicaoCompraLivro(Integer idReqCompra, LocalDate dataReqCompra, String estado, Encomenda encomenda, PropostaAquisicao propostaAquisicao) {
        super(idReqCompra, dataReqCompra, estado, encomenda);
        this.propostaAquisicao = propostaAquisicao;
    }

    public PropostaAquisicao getPropostaAquisicao() {
        return propostaAquisicao;
    }

}
