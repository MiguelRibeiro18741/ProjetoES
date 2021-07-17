public class CopiaEbook {
    private static int i =0;
    private Integer idCopiaEbook;
    private Servidor servidor;
    private Ebook ebook;

    public CopiaEbook(Servidor servidor, Ebook ebook) {
        this.idCopiaEbook = getProximo();
        this.servidor = servidor;
        this.ebook = ebook;
    }

    public Integer getIdCopiaEbook() {
        return idCopiaEbook;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public Ebook getEbook() {
        return ebook;
    }

    public void mostrarCopiaEbook() {
        System.out.println("Copia Ebook: " + this.idCopiaEbook);
    }

    protected static int getProximo(){
        return ++i;
    }
}
