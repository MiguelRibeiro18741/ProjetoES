import java.time.LocalDate;

public class RequisicaoCompraCopia extends RequisicaoCompra{
    public RequisicaoCompraCopia(Integer idReqCompra, LocalDate dataReqCompra, String estado, Encomenda encomenda) {
        super(idReqCompra, dataReqCompra, estado, encomenda);
    }
}
