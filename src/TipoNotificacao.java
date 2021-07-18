public class TipoNotificacao {
    private static int i =0;
    private Integer idTipoNotif = getProximo();
    private java.lang.String texto;

    public TipoNotificacao(String texto) {
        this.texto = texto;
    }

    public Integer getIdTipoNotif() {
        return idTipoNotif;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    protected static int getProximo() {
        return ++i;
    }
}
