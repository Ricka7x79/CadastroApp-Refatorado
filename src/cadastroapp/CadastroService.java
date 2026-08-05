package cadastroapp;

public class CadastroService {

    public void cadastrar(Pessoa pessoa) {
        PessoaDAO.adicionar(pessoa);
    }

}