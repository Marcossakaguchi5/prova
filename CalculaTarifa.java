// A classe CalculaTarifa está herdendando as varivaeris da classe Viagem
public class CalculaTarifa extends Viagem{
    private double tarifaValor;

    public double getTarifaValor() {
        return tarifaValor;
    }

    public void setTarifaValor(double tarifaValor) {
        this.tarifaValor = tarifaValor;
    };

    public void CalculaTarifa(){
        double valorTarifa = (20 + (getDistancia()/getTempo()*0.1));
        System.out.println("O valor da tarifa é "+valorTarifa);
    }

}
