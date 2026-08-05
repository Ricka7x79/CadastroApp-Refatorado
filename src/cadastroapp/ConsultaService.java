package cadastroapp;

import java.util.List;

public class ConsultaService {

    public List<Pessoa> listar() {
        return PessoaDAO.listar();
    }

    public void remover(int indice) {
        PessoaDAO.remover(indice);
    }

}