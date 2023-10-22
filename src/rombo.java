import java.util.Scanner;
public class rombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte las diagonales");
        int D1 = sc.nextInt();
        int D2 = sc.nextInt();
        int A = D1*D2;
        System.out.println("Inserte un lado superior y otro inferior");
        int L1 = sc.nextInt();
        int L2 = sc.nextInt();
        int P = L1 + L2;
    }
}
