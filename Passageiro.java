// A classe Passageiro herda a classe Usuario e a interface Corrida
public class Passageiro extends Usuario implements Corrida{
    
    // ========================== Encapsulamento ==========================
    private Double saldo;

    // Getters and Setters 
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    // ====================================================================

    // ====== Aplicando os metódos herdados da interface Corrida ==========
    @Override
    public boolean pedirViagem(String resposta) {
        System.out.println("Passageiro pediu uma viagem !!");
        if (resposta == "sim"){
            System.out.println("Motorista aceitou a viagem");
            return true;
        }else{
            System.out.println("Motorista recusou a viagem");
            return false;
        }
        
    }
    // ====================================================================

}
