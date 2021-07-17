import java.time.LocalDate;

public class Emprestimo {
    private Integer idEmp;
    private java.time.LocalDate dataHoraEmp;
    private java.time.LocalDate dataHoraPrevDev;
    private Funcionario funcionario;

    public Emprestimo(Integer idEmp, LocalDate dataHoraEmp, LocalDate dataHoraPrevDev, Funcionario funcionario) {
        this.idEmp = idEmp;
        this.dataHoraEmp = dataHoraEmp;
        this.dataHoraPrevDev = dataHoraPrevDev;
        this.funcionario = funcionario;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public LocalDate getDataHoraEmp() {
        return dataHoraEmp;
    }

    public LocalDate getDataHoraPrevDev() {
        return dataHoraPrevDev;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setDataHoraEmp(LocalDate dataHoraEmp) {
        this.dataHoraEmp = dataHoraEmp;
    }

    public void setDataHoraPrevDev(LocalDate dataHoraPrevDev) {
        this.dataHoraPrevDev = dataHoraPrevDev;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
