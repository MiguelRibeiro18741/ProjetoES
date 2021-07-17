public class Funcionario {
    private static int i =0;
    private Integer idFunci;
    private java.lang.String nomeFunci;
    private java.lang.String moradaFunci;
    private java.lang.String emailFunci;

    public Funcionario(String nomeFunci, String moradaFunci, String emailFunci) {
        this.idFunci = getProximo();
        this.nomeFunci = nomeFunci;
        this.moradaFunci = moradaFunci;
        this.emailFunci = emailFunci;
    }

    public Integer getIdFunci() {
        return idFunci;
    }

    public String getNomeFunci() {
        return nomeFunci;
    }

    public String getMoradaFunci() {
        return moradaFunci;
    }

    public String getEmailFunci() {
        return emailFunci;
    }

    public void setNomeFunci(String nomeFunci) {
        this.nomeFunci = nomeFunci;
    }

    public void setMoradaFunci(String moradaFunci) {
        this.moradaFunci = moradaFunci;
    }

    public void setEmailFunci(String emailFunci) {
        this.emailFunci = emailFunci;
    }

    public void mostrar(){
        System.out.println("Id Funcionario: "+ this.idFunci + " // Funcionario: " + this.nomeFunci + " // Morada: " + this.moradaFunci + " // Email: " + this.emailFunci);
    }

    protected static int getProximo() {
        return ++i;
    }
}
