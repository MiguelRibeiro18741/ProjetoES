public class Utilizador {
    private static int i =0;
    private Integer numMec;
    private java.lang.String nome;
    private java.lang.String password;
    private java.lang.String morada;
    private java.lang.String email;
    private java.lang.String estado;
    private TipoUtilizador tipoUtilizador;

    public Utilizador(String nome, String password, String morada, String email, String estado, TipoUtilizador tipoUtilizador) {
        this.numMec = getProximo();
        this.nome = nome;
        this.password = password;
        this.morada = morada;
        this.email = email;
        this.estado = estado;
        this.tipoUtilizador = tipoUtilizador;
    }

    public Integer getNumMec() {
        return numMec;
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public String getMorada() {
        return morada;
    }

    public String getEmail() {
        return email;
    }

    public String getEstado() {
        return estado;
    }

    public TipoUtilizador getTipoUtilizador() {
        return tipoUtilizador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTipoUtilizador(TipoUtilizador tipoUtilizador) {
        this.tipoUtilizador = tipoUtilizador;
    }

    public void mostrar(){
        System.out.println("Número mecanografico: " + this.numMec + " // Nome: " + this.nome + " // Morada: " + this.morada + " // Email: " + this.email +  " // Tipo Utilizador: " + this.tipoUtilizador + " // Estado: " + this.estado);
    }

    protected static int getProximo() {
        return ++i;
    }
}
