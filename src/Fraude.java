import java.time.LocalDate;

public class Fraude {
    private static int i=0;
    private Integer idFraude = getProximo();
    private java.time.LocalDate dataFraude;
    private java.lang.String descricaoFraude;
    private Funcionario funcionario;
    private EmprestimoEbook emprestimoEbook;

    public Fraude(LocalDate dataFraude, String descricaoFraude , Funcionario funcionario, EmprestimoEbook emprestimoEbook) {
        this.dataFraude = dataFraude;
        this.descricaoFraude = descricaoFraude;
        this.funcionario = funcionario;
        this.emprestimoEbook = emprestimoEbook;
    }

    public Integer getIdFraude() {
        return idFraude;
    }

    public LocalDate getDataFraude() {
        return dataFraude;
    }

    public String getDescricaoFraude() { return descricaoFraude; }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public EmprestimoEbook getEmprestimoEbook() {
        return emprestimoEbook;
    }

    public void setDataFraude(LocalDate dataFraude) {
        this.dataFraude = dataFraude;
    }

    public void setDescricaoFraude(String descricaoFraude) { this.descricaoFraude = descricaoFraude; }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setEmprestimoEbook(EmprestimoEbook emprestimoEbook) {
        this.emprestimoEbook = emprestimoEbook;
    }

    protected static int getProximo(){
        return ++i;
    }
}
