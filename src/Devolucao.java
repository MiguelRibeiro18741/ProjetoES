import java.time.LocalDate;

public class Devolucao {
    private Integer idDev;
    private java.time.LocalDate dataHoraDev;
    private Emprestimo emprestimo;
    private Funcionario funcionario;

    public Devolucao(Integer idDev, LocalDate dataHoraDev, Emprestimo emprestimo, Funcionario funcionario) {
        this.idDev = idDev;
        this.dataHoraDev = dataHoraDev;
        this.emprestimo = emprestimo;
        this.funcionario = funcionario;
    }

    public Integer getIdDev() {
        return idDev;
    }

    public LocalDate getDataHoraDev() {
        return dataHoraDev;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setDataHoraDev(LocalDate dataHoraDev) {
        this.dataHoraDev = dataHoraDev;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
