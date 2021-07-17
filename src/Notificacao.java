import java.time.LocalDate;

public class Notificacao {
    private static int i =0;
    private Integer idNotif;
    private java.time.LocalDate dataHoraNotif;
    private TipoNotificacao tipoNotificacao;
    private Emprestimo emprestimo;

    public Notificacao(LocalDate dataHoraNotif, TipoNotificacao tipoNotificacao, Emprestimo emprestimo) {
        this.idNotif = getProximo();
        this.dataHoraNotif = dataHoraNotif;
        this.tipoNotificacao = tipoNotificacao;
        this.emprestimo = emprestimo;
    }

    public Integer getIdNotif() {
        return idNotif;
    }

    public LocalDate getDataHoraNotif() {
        return dataHoraNotif;
    }

    public TipoNotificacao getTipoNotificacao() {
        return tipoNotificacao;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public void mostrar(){
        System.out.println("Notificação: " + this.idNotif + ": " + this.tipoNotificacao);
    }

    protected static int getProximo() {
        return ++i;
    }
}
