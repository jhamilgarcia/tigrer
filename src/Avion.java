public class Avion {
    private String Fabricante;
    private int Motores;
    public Avion (String Fabricante, int Motores){
        this.Fabricante = Fabricante;
        this.Motores = Motores;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public int getMotores() {
        return Motores;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    public void setMotores(int motores) {
        Motores = motores;
    }
    public void mostrar(){
        System.out.println("Fabricante " + getFabricante());
        System.out.println("Motores " + getMotores());
    }
}
