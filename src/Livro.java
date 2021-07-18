public class Livro {
    private static int i =0;
    private Integer idLivro = getProximo();
    private java.lang.String titulo;
    private java.lang.String autor;
    private Integer ano;
    private java.lang.String ISBN;
    private Editora editora;

    public Livro(String titulo, String autor, Integer ano, String ISBN, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
        this.editora = editora;
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAno() {
        return ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void mostrar(){
        System.out.println("Livro: " + this.idLivro + "// Titulo: " + this.titulo);
    }

    protected static int getProximo() {
        return ++i;
    }
}
