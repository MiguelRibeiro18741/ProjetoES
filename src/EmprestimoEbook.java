import java.time.LocalDate;

public class EmprestimoEbook {
    private static int i =0;
    private Integer idEmpEbook = getProximo();
    private java.time.LocalDate dataHoraEmpEbook;
    private java.time.LocalDate dataExpiracao;
    private Integer vezesProlongado;
    private CopiaEbook copiaEbook;
    private Utilizador utilizador;

    public EmprestimoEbook(LocalDate dataHoraEmpEbook, LocalDate dataExpiracao, Integer vezesProlongado, CopiaEbook copiaEbook, Utilizador utilizador) {
        this.dataHoraEmpEbook = dataHoraEmpEbook;
        this.dataExpiracao = dataExpiracao;
        this.vezesProlongado = vezesProlongado;
        this.copiaEbook = copiaEbook;
        this.utilizador = utilizador;
    }

    public Integer getIdEmpEbook() {
        return idEmpEbook;
    }

    public LocalDate getDataHoraEmpEbook() {
        return dataHoraEmpEbook;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public Integer getVezesProlongado() {
        return vezesProlongado;
    }

    public CopiaEbook getCopiaEbook() {
        return copiaEbook;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public void setVezesProlongado(Integer vezesProlongado) {
        this.vezesProlongado = vezesProlongado;
    }

    public void MostrarEmprestimoEbook(){
        System.out.println(getCopiaEbook());
        System.out.println(getUtilizador());
        System.out.println(getDataExpiracao());
        System.out.println(getIdEmpEbook());
        System.out.println(getVezesProlongado());
        System.out.println(getDataHoraEmpEbook());
    }

    protected static int getProximo(){
        return ++i;
    }
}
