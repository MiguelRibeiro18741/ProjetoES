import java.util.ArrayList;

public class Repositorio {
    private ArrayList<Coima> coimas=new ArrayList<>();
    private ArrayList<Copia>copias=new ArrayList<>();
    private ArrayList<Devolucao>devolucaos= new ArrayList<>();
    private ArrayList<Emprestimo>emprestimos=new ArrayList<>();
    private ArrayList<Encomenda>encomendas=new ArrayList<>();
    private ArrayList<Editora>editoras=new ArrayList<>();
    private ArrayList<Livro>livros=new ArrayList<>();
    private ArrayList<Notificacao>notificacaos=new ArrayList<>();
    private ArrayList<TipoNotificacao>tipoNotificacaos=new ArrayList<>();
    private ArrayList<PropostaAquisicao>propostaAquisicaos=new ArrayList<>();
    private ArrayList<Requisicao>requisicaos=new ArrayList<>();
    private ArrayList<RequisicaoCompra>requisicaoCompras=new ArrayList<>();
    private ArrayList<Fraude>fraudes= new ArrayList<>();
    private ArrayList<Ebook>ebooks=new ArrayList<>();
    private ArrayList<CopiaEbook>copiaEbooks= new ArrayList<>();
    private ArrayList<Servidor>servidores=new ArrayList<>();
    private ArrayList<EmprestimoEbook>emprestimoEbooks= new ArrayList<>();
    private ArrayList<Funcionario>funcionarios=new ArrayList<>();
    private ArrayList<Utilizador>utilizadores=new ArrayList<>();
    private ArrayList<TipoUtilizador>tipoUtilizadors=new ArrayList<>();
    private ArrayList<EntradaNovoLivro>entradaNovoLivros= new ArrayList<>();



    public Repositorio() {

    }

    public void	adicionaCoima(Coima coima) { coimas.add(coima); }
    public void	adicionaCopia(Copia copia) { copias.add(copia); }
    public void adicionacopiaEbooks (CopiaEbook copiaEbook) { copiaEbooks.add(copiaEbook); }
    public void adicionadetecaoFraudes (Fraude fraude) { fraudes.add(fraude);}
    public void adicionadevolucaos(Devolucao devolucao) {devolucaos.add(devolucao);}
    public void adicionaebooks(Ebook ebook) { ebooks.add(ebook);}
    public void adicionaeditora(Editora editora) { editoras.add(editora);}
    public void adicionaemprestimo(Emprestimo emprestimo) { emprestimos.add(emprestimo);}
    public void adicionaemprestimoebook(EmprestimoEbook emprestimoebook) { emprestimoEbooks.add(emprestimoebook);}
    public void adicionaencomenda(Encomenda encomenda) { encomendas.add(encomenda);}
    public void adicionaentradanovolivro(EntradaNovoLivro entradanovolivro) { entradaNovoLivros.add(entradanovolivro);}
    public void adicionafuncionarios(Funcionario funcionario) { funcionarios.add(funcionario);}
    public void adicionalivro(Livro livro) { livros.add(livro);}
    public void adicionanotificacao(Notificacao notificacao) { notificacaos.add(notificacao);}
    public void adicionapropostaaquisicao(PropostaAquisicao propostaaquisicao) { propostaAquisicaos.add(propostaaquisicao);}
    public void adicionarequisicao(Requisicao requisicao) { requisicaos.add(requisicao);}
    public void adicionarequisicaocompra(RequisicaoCompra requisicaocompra) { requisicaoCompras.add(requisicaocompra);}
    public void adicionaservidor(Servidor servidor) { servidores.add(servidor);}
    public void adicionatiponotificacao(TipoNotificacao tiponotificacao) { tipoNotificacaos.add(tiponotificacao);}
    public void adicionatipoutilizador(TipoUtilizador tipoutilizador) { tipoUtilizadors.add(tipoutilizador);}
    public void adicionautilizador(Utilizador utilizador) { utilizadores.add(utilizador);}

    public EmprestimoEbook devolveEmpEB(int idEbook ) {
        for(EmprestimoEbook emprestimoEbook : this.emprestimoEbooks){
            if(emprestimoEbook.getIdEmpEbook() == idEbook){
                return emprestimoEbook;
            }
        }
        return null;
    }
}
