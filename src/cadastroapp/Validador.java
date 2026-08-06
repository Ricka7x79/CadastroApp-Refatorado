package cadastroapp;

public class Validador {

    public boolean cpfValido(String cpf) {

        if (cpf == null) {
            return false;
        }

        return cpf.length() == 11;

    }

}