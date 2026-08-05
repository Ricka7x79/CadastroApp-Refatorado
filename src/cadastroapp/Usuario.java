
package cadastroapp;


public class Usuario {
    
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String perfil;
    
    public Usuario(int id, String nome, String login, String senha, String perfil) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
    }
    
    public String getNome() {
        return nome;
    }
    
}
