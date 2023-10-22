import java.util.Scanner;
public class Cine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos de la pelicula Nombre, Director, Duracion, año, calificacion");
        Pelicula.Genero g = Pelicula.Genero.ACCION;
        Pelicula P1 = new Pelicula(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextDouble(),g);
        P1.mostrar();
    }
}
