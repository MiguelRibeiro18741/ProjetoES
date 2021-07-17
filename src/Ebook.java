import java.util.ArrayList;

public class Ebook extends Livro{
    private static int i=0;
    private Integer idEbook;
    private java.lang.String formato;
    private Integer tamanhoFicheiro;
    private java.lang.String assinaturaHash;
    private ArrayList<CopiaEbook> Copias;

    public Ebook(String titulo, String autor, Integer ano, String ISBN, Editora editora, String formato, Integer tamanhoFicheiro, String assinaturaHash) {
        super(titulo, autor, ano, ISBN, editora);
        this.idEbook = getProximo();
        this.formato = formato;
        this.tamanhoFicheiro = tamanhoFicheiro;
        this.assinaturaHash = assinaturaHash;
    }

    public String getFormato() {
        return formato;
    }

    public Integer getTamanhoFicheiro() {
        return tamanhoFicheiro;
    }

    public String getAssinaturaHash() {
        return assinaturaHash;
    }

    public ArrayList<CopiaEbook> getCopias() {
        return Copias;
    }

    public void setTamanhoFicheiro(Integer tamanhoFicheiro) {
        this.tamanhoFicheiro = tamanhoFicheiro;
    }

    public void setAssinaturaHash(String assinaturaHash) {
        this.assinaturaHash = assinaturaHash;
    }

    public void mostrar(){
        System.out.println("Ebook: " + this.idEbook + " // Formato: " + this.formato + " // Tamanho do Ficheiro: " + this.tamanhoFicheiro + " // Assinatura Hash: " + this.assinaturaHash);
    }

    public void adicionarCopias(CopiaEbook copiaEbook){
        Copias.add(copiaEbook);
    }

    protected static int getProximo(){
        return ++i;
    }
}
