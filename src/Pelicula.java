public class Pelicula {
    private String Nombre;
    private String Director;
    private int año;
    private int Duracion;
    private double Calificacion;
    private Genero gen;
    private boolean Epica = true;
    public Pelicula (String Nombre,String Director, int Duracion,int año,double Calificacion,Genero gen){
        this.Nombre = Nombre;
        this.Director = Director;
        this.Duracion = Duracion;
        this.Epica = Epica;
        this.año = año;
        this.Calificacion = Calificacion;
        this.gen = gen;
        EspeliculaEpica(Duracion);
    }
    private void EspeliculaEpica(int Duracion){
        if(Duracion > 180) {
            Epica = false;
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDirector() {
        return Director;
    }

    public int getDuracion() {
        return Duracion;
    }

    public int getAño() {
        return año;
    }

    public double getCalificacion() {
        return Calificacion;
    }

    public Genero getGen() {
        return gen;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setCalificacion(double calificacion) {
        Calificacion = calificacion;
    }

    public void setGen(Genero gen) {
        this.gen = gen;
    }

    public enum Genero {
        ACCION, COMEDIA, DRAMA, SUSPENSO
    }
    public void mostrar(){
        System.out.println(Nombre);
        System.out.println(calificador(Calificacion));
        System.out.println("Año de estreno " + año);
        System.out.println(gen);
        System.out.println(" Dirijida por " + Director);
    }
    private String calificador(double calificacion){
        String Es = "*";
        if (calificacion > 2){
            Es = Es+"*";
        }
        if (calificacion > 5) {
            Es = Es + "*";
        }
        if (calificacion > 7){
            Es = Es+"*";
        }
        if (calificacion > 8){
            Es = Es+"*";
        }
        return Es;
    }
}
