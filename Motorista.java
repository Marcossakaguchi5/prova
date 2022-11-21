// A classe Motorista herda a classe Usuario e a interface Corrida
public class Motorista extends Usuario implements Corrida{
    
    // ========================== Encapsulamento ==========================
    private String cnh;
    private String modeloCarro;

    // Getters and Setters 
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public String getModeloCarro() {
        return modeloCarro;
    }
    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }
    // ====================================================================


    @Override
    public boolean pedirViagem(String resposta) {
        if(resposta == "sim"){
            System.out.println("A viagem foi aceita");
            return true;
        }else{
            System.out.println("O motorista negou a viagem"); 
            return false;
        }
        
    }
}