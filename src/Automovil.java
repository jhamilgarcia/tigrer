

enum  Combustible{
    GASOLINA,BIOETANOL,DIESEL,BIODIESEL,GAS_NATURAL
}
enum TipoAutomovil{
    SUBCOMPACTO,COMPACTO,FAMILIAR,EJECUIVO,SUV
}
enum Color{
    BLANCO,NEGRO,ROJO,NARANJA,AMARILLO,VERDE,AZUL,VIOLETA
}
public class Automovil {
    private String Marca;
    private int Modelo;
    private int Motor;
    private Combustible C;
    private TipoAutomovil TA;
    private int puertas ;
    private int asiento;
    private int velM;
    private Color Co;
    private int velA;
    public Automovil (String Marca, int Modelo,int Motor, Combustible C,TipoAutomovil Ta,int puertas, int asiento, int velM, Color Co){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Motor = Motor;
        this.C = C;
        this.TA = TA;
        this.puertas = puertas;
        this.asiento = asiento;
        this.velM = velM;
        this.Co = Co;
        velA = 0;
    }

    public String getMarca() {
        return Marca;
    }

    public int getMotor() {
        return Motor;
    }

    public Combustible getC() {
        return C;
    }

    public TipoAutomovil getTA() {
        return TA;
    }

    public int getModelo() {
        return Modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getAsiento() {
        return asiento;
    }

    public int getVelM() {
        return velM;
    }

    public Color getCo() {
        return Co;
    }

    public int getVelA() {
        return velA;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setModelo(int modelo) {
        Modelo = modelo;
    }

    public void setMotor(int motor) {
        Motor = motor;
    }

    public void setC(Combustible c) {
        C = c;
    }

    public void setTA(TipoAutomovil TA) {
        this.TA = TA;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public void setVelM(int velM) {
        this.velM = velM;
    }

    public void setCo (Color co) {
        Co = co;
    }
    public void CambiarV (int V){
        if (V > velM ){
            System.out.println("Fuera de la velocidad maxima");
        }
        velA = velA + V;
    }
    public void Desaselerar(int V){
        if (V < 0){
            System.out.println("No valores negativos");
        }
        velA = velA - V;
        if (velA < 0){
            velA = 0;
        }
    }
    public void Frenar(){
        velA = 0;

    }

    public void Mostrar(){
        System.out.println(Marca +" " + Modelo + " " + Motor + " "+ C);
        System.out.println(TA + " " + puertas + " " + asiento + " " + velM);
        System.out.println(Co);
        System.out.println(velA);
    }
}
