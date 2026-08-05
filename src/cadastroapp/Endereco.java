package cadastroapp;

public class Endereco {

    private int id;
    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;

    // Construtor
    public Endereco(int id, String logradouro, String numero, String cidade, String estado) {
        this.id = id;
        this.logradouro = logradouro; // corrigido
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    // toString para exibição legível
    @Override
    public String toString() {
        return logradouro + ", " + numero + " - " + cidade + " - " + estado;
    }
}
