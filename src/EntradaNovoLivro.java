import java.time.LocalDate;

public class EntradaNovoLivro {
    private static int i =0;
    private Integer idEntNovoLivro = getProximo();
    private java.time.LocalDate dataEntrada;

    public EntradaNovoLivro(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Integer getIdEntNovoLivro() {
        return idEntNovoLivro;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void MostrarEntradadaNovoLivro(){
        System.out.println(getDataEntrada());
        System.out.println(getIdEntNovoLivro());
    }

    protected static int getProximo() {
        return ++i;
    }
}
