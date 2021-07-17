import java.time.LocalDate;

public class Fraude {
    private static int i=0;
    private Integer idFraude;
    private java.time.LocalDate dataFraude;
    private Funcionario funcionario;
    private EmprestimoEbook emprestimoEbook;

    public Fraude(LocalDate dataFraude, Funcionario funcionario, EmprestimoEbook emprestimoEbook) {
        this.idFraude = getProximo();
        this.dataFraude = dataFraude;
        this.funcionario = funcionario;
        this.emprestimoEbook = emprestimoEbook;
    }

    public Integer getIdFraude() {
        return idFraude;
    }

    public LocalDate getDataFraude() {
        return dataFraude;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public EmprestimoEbook getEmprestimoEbook() {
        return emprestimoEbook;
    }

    public void setDataFraude(LocalDate dataFraude) {
        this.dataFraude = dataFraude;
    }

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
