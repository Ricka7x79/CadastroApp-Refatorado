
package cadastroapp;

import java.util.ArrayList;
import java.util.List;


public class PessoaDAO {
    
    
    private static List<Pessoa> pessoas = new ArrayList<>();

    public static void adicionar(Pessoa p) {
        pessoas.add(p);
    }

    public static List<Pessoa> listar() {
        return pessoas;
    }

    public static void remover(int index) {
        pessoas.remove(index);
    }
}
    

