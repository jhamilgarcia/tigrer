import java.util.Scanner;

public class angar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Avion A1 = new Avion("Airbus",4);
        Avion A2 = new Avion(A1.getFabricante(), A1.getMotores());
        A1.mostrar();
        A2.mostrar();
        A2.setFabricante("Stealth");
        A1.mostrar();
    }
}
