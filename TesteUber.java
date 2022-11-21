// Marcos Hideki && Luis Ricardo 
public class TesteUber {

    public static void main(String[] args){
        Motorista m = new Motorista();
        m.setNome("Roberto");
        m.setEmail("carlos@gmail.com");
        m.setSenha("Batata");
        m.setCnh("ABDCE");
        m.setModeloCarro("Corsa");

        /* Polimorfismo: o objeto m do tipo Motorista está se passando 
        por objeto do tipo usuario na função login */ 

        m.login("Batata", "carlos@gmail.com");
    }
}
