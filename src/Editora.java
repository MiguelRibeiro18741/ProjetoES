public class Editora {
    private static int i =0;
    private Integer idEditora;
    private java.lang.String termoResponsabilidade;
    private java.lang.String nomeEditora;

    public Editora(String termoResponsabilidade, String nomeEditora) {
        this.idEditora = getProximo();
        this.termoResponsabilidade = termoResponsabilidade;
        this.nomeEditora = nomeEditora;
    }

    public Integer getIdEditora() {
        return idEditora;
    }

    public String getTermoResponsabilidade() {
        return termoResponsabilidade;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setTermoResponsabilidade(String termoResponsabilidade) {
        this.termoResponsabilidade = termoResponsabilidade;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public void mostrarTermosResponsabilidade(){
        System.out.println("Termos de responsabilidade: " + this.termoResponsabilidade);
    }

    protected static int getProximo(){
        return ++i;
    }
}
