import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Encomenda {
    private static int i =0;
    private Integer idEncomenda;
    private java.time.LocalDate dataEncomenda;
    private EntradaNovoLivro entradaNovoLivro;
    private List<Livro> ListaLivros;

    public Encomenda(LocalDate dataEncomenda, EntradaNovoLivro entradaNovoLivro) {
        this.idEncomenda = getProximo();
        this.dataEncomenda = dataEncomenda;
        this.entradaNovoLivro = entradaNovoLivro;
        this.ListaLivros = new ArrayList<>();
    }

    public Integer getIdEncomenda() {
        return idEncomenda;
    }

    public LocalDate getDataEncomenda() {
        return dataEncomenda;
    }

    public EntradaNovoLivro getEntradaNovoLivro() {
        return entradaNovoLivro;
    }

    public void setEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
        this.entradaNovoLivro = entradaNovoLivro;
    }

    public void  MostrarEncomenda(){
        System.out.println(getDataEncomenda());
        System.out.println(getIdEncomenda());
        System.out.println((getEntradaNovoLivro()));
    }

    public void addLivro(Livro livro){
        if(livro != null) {
            this.ListaLivros.add(livro);
        }
    }

    public void mostrar(){
        for(int i = 0; i < this.ListaLivros.size(); i++){
            this.ListaLivros.get(i).mostrar();
        }
    }

    public List<Livro> getListaLivros() {
        return ListaLivros;
    }

    protected static int getProximo() {
        return ++i;
    }
}
