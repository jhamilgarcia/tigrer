import java.util.Scanner;
public class ejercio_CuentaBancaria {
    public static void main(String[] args) {
        int O;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre apellido numero de cuenta y tipo de cuenta");
        String N = sc.nextLine();
        String A = sc.nextLine();
        Cuenta_Bancaria C1 = new Cuenta_Bancaria(N,A,sc.nextInt());
        System.out.println("¿Que quiere hacer?");
        do {
            System.out.println("1.Consultar saldo");
            System.out.println("2.añadir saldo");
            System.out.println("3.Retirar saldo");
            System.out.println("4.Salir");
            O = sc.nextInt();
            if (O == 1){
                C1.Muestra();
            }
            if (O == 2){
                System.out.println("Ingrese un monto de ingreso");
                C1.Consignar(sc.nextDouble());
            }
            if (O == 3){
                System.out.println("Ingrese un monto a retirar");
                C1.Retiro(sc.nextInt());
            }
        }while (O != 4);
        System.out.println("Grasias por usar nuestro servicio Banco estafa");
        C1.Estado(C1.getS());
        Interes I1 = new Interes(C1.getS());
        if (I1.getSaldo() != 0) {
            C1.Consignar(I1.getSaldo());
        }
        C1.Muestra();
        System.out.println("Cuenta bancaria " + C1.getEstado());
    }
}
