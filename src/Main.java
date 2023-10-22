
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Automovil A1 = new Automovil(sc.nextLine(),sc.nextInt(), sc.nextInt(),Combustible.GASOLINA,TipoAutomovil.COMPACTO,sc.nextInt(),sc.nextInt(),sc.nextInt(),Color.ROJO);
            System.out.println("Que distancia desea recorer");
            int Distancia = sc.nextInt();
            int T = 0;
            if (A1.getVelA() <= 0){
                System.out.println("El auto no se mueve");
            }else {
                for (int i = 0; Distancia > A1.getVelA(); i++) {
                    Distancia = Distancia - A1.getVelA();
                    T = i;
                }
                System.out.println("Se llegara en al menos " + T + " Horas");
            }
            System.out.println("Velosidad actual " + A1.getVelA());
            System.out.println("Acelerar");
            A1.CambiarV(sc.nextInt());
            System.out.println("Velosidad actual " + A1.getVelA());
            A1.Desaselerar(sc.nextInt());
            System.out.println("Velosidad actual " + A1.getVelA());
            A1.Frenar();
            System.out.println("Velosidad actual " + A1.getVelA());
            A1.Mostrar();
        }
    }