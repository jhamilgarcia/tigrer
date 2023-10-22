public class Interes {
    double saldo;
    public Interes (double Saldo){
        this.saldo = saldo;
        ApIn(saldo);

    }
    private double ApIn(double S){
        S = S * 0.5;
        return S;
    }

    public double getSaldo() {
        return saldo;
    }
}
