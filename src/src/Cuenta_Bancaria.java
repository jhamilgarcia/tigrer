public class Cuenta_Bancaria {
    private String Nombre;
    private String Apellido;
    private int Nª;
    private double S;
    private String Estado;
    public Cuenta_Bancaria(String Nombre, String Apellido, int N){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nª = Nª;
        S = 0;
        this.Estado = Estado;
    }
    public void Consignar(double s) {
        if (s < 0){
            System.out.println("No se admiten numeros negativos");
            s = 0;
        }
        S = S+s;
    }

    public void Retiro(double s) {
        if (s > S) {
            System.out.println("No posee el saldo nesesario para retirar ese monto");
            s = 0;
        }
        if(s < 0){
            System.out.println("No se admiten numeros negativos");
        }
        S = S - s;
    }
    public void Muestra(){
        System.out.println(Nombre + " " + Apellido);
        System.out.println("Saldo " + S);
    }

    public double getS() {
        return S;
    }

    public void Estado (double S){
        if (S == 0 ){
            Estado = "Inactivo";
        }else {
            Estado = "Activo";
        }
    }

    public String getEstado() {
        return Estado;
    }
}
