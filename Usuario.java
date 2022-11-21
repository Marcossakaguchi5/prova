// A classe Usuario é abstrata e classe mãe das classes Passageiro e Motorista.
public abstract class Usuario{

    // ========================== Encapsulamento ==========================
    private String nome;
    private String idade;
    private String email;
    private String senha;
    private int telefone;
    
    //Getters and Setters: 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    } 
    // ====================================================================

    // Métodos:  
    public boolean login(String senha, String email){
        if((this.getSenha() == senha)&&(this.getEmail() == email)){
            return true;
        }else{
            System.out.println("Credenciais erradas");
            return false;
        }
    }
}
