public class TipoUtilizador {
    private static int i =0;
    private Integer idTipo;
    private Integer prazoEmp;
    private Integer maxLivros;

    public TipoUtilizador(Integer prazoEmp, Integer maxLivros) {
        this.idTipo = getProximo();
        this.prazoEmp = prazoEmp;
        this.maxLivros = maxLivros;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public Integer getPrazoEmp() {
        return prazoEmp;
    }

    public Integer getMaxLivros() {
        return maxLivros;
    }

    public void setPrazoEmp(Integer prazoEmp) {
        this.prazoEmp = prazoEmp;
    }

    public void setMaxLivros(Integer maxLivros) {
        this.maxLivros = maxLivros;
    }

    protected static int getProximo() {
        return ++i;
    }
}
