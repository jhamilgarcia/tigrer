import java.util.Scanner;
public class Sistema_Solar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Planeta P1 = new Planeta(null,0,0.0,0.0,0,Tipo.TERRESTRE,0,false);
        Planeta P2 = new Planeta(null,0,0.0,0.0,0,Tipo.TERRESTRE,0,false);
        System.out.println("Ingrese los valores del primer planeta");
        P1.setNombre("Tierra");
        P1.setSatelites(1);
        P1.setMasa(5.9736);
        P1.setVolumen(1.08321);
        P1.setTipo(Tipo.TERRESTRE);
        P1.setDiametro(12742);
        P1.setDistS(1);
        P1.setObser(true);

        P2.setNombre("Jupiter");
        P2.setSatelites(1);
        P2.setMasa(1.899);
        P2.setVolumen(1.4313);
        P2.setDiametro(139820);
        P2.setDistS(5);
        P2.setTipo(Tipo.GASEOSO);
        P2.setObser(true);

        P1.Mostrar();
        P1.Densidad();
        P1.Fuera();

        P2.Mostrar();
        P2.Densidad();
        P2.Fuera();
    }
}
