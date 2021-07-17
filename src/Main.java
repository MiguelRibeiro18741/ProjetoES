import java.time.LocalDate;

public class Main {
    public static void main(){
        TipoUtilizador tipoUtilizador = new TipoUtilizador(2, 8);
        Utilizador utilizador = new Utilizador("Miguel", "12ab34cd", "Rua dos colegios nº10", "miguel@gmail.com", "Ativo", tipoUtilizador);
        Funcionario funcionario = new Funcionario("Alberto", "Rua dos cães nº7", "joaquim@gmail.com");

        Repositorio repositorio = new Repositorio();

        Editora editora = new Editora("Sim", "Porto Editora");
        Ebook ebook = new Ebook("Harry Potter", "JKR", 2000, "1a2b3c", editora, "pdf", 50, "assinatura");
        Servidor servidor = new Servidor("Aveiro");
        CopiaEbook copiaEbook= new CopiaEbook(servidor, ebook);

        //Ebook.adicionaCopias(Copia)

        int prazoEmp = utilizador.getTipoUtilizador().getPrazoEmp();
        LocalDate dataExpiracaoEmp = LocalDate.now().plusDays(prazoEmp);
        EmprestimoEbook emprestimoEbook= new EmprestimoEbook(LocalDate.now(), dataExpiracaoEmp, 0, copiaEbook, utilizador);
        System.out.printf("Data de entrega: %s\n", emprestimoEbook.getDataExpiracao().toString());
        System.out.printf("Número de prolongamentos: %d\n", emprestimoEbook.getVezesProlongado()+1);


        emprestimoEbook.setDataExpiracao(emprestimoEbook.getDataExpiracao().plusDays(prazoEmp));
        emprestimoEbook.setVezesProlongado(emprestimoEbook.getVezesProlongado()+1);
        System.out.printf("Data de entrega após prolongamento: %s\n", emprestimoEbook.getDataExpiracao().toString());
        System.out.printf("Número de vezes prolongado após prolongamento: %d\n", emprestimoEbook.getVezesProlongado());

        Fraude detecaoFraude = new Fraude(LocalDate.now(), funcionario, emprestimoEbook);

        System.out.printf("Nome do utilizador: %s\n", utilizador.getNome());
        System.out.printf("Tipo do utilizador: %s\n", utilizador.getTipoUtilizador());
        System.out.printf("Nome do funcionário: %s\n", funcionario.getNomeFunci());
        System.out.printf("Nome da editora: %s\n", ebook.getEditora().getNomeEditora());
        System.out.printf("ID servidor: %s\n", copiaEbook.getServidor());

        repositorio.adicionautilizador(utilizador);
        repositorio.adicionafuncionarios(funcionario);
        repositorio.adicionaeditora(editora);
        repositorio.adicionaebooks(ebook);
        repositorio.adicionaservidor(servidor);
        repositorio.adicionacopiaEbooks(copiaEbook);
        repositorio.adicionadetecaoFraudes(detecaoFraude);

        EmprestimoEbook emprestimoEbook1 = repositorio.devolveEmpEB(emprestimoEbook.getIdEmpEbook());

        System.out.printf("Repositório: %s\n", emprestimoEbook1.getIdEmpEbook());
        System.out.printf("Nome do Ebook devolvido: %s\n", emprestimoEbook1.getCopiaEbook().getEbook().getTitulo());
    }
}
