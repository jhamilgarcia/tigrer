import java.util.Scanner;
public class Trapecio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base inferior y la superior luego la altura");
        int B = sc.nextInt();
        int b = sc.nextInt();
        int H = sc.nextInt();
        int A = ((B*b)/2)*H;
        System.out.println("Inserte un lado del trapecio");
        int L = sc.nextInt();
        int P = B+b+L*2;
    }
}
