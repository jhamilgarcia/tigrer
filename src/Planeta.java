 enum Tipo{
        GASEOSO,TERRESTRE,ENANO;
    }

    public class Planeta {
        private String Nombre = null;
        private int Satelites;
        private double Masa;
        private double Volumen;
        private int Diametro;
        private int DistS;
        private Tipo tipo;
        private Boolean Obser;
        public Planeta (String Nombre, int Satelites, double Masa,double Volumen,int Diametro, Tipo tipo,int DistS, Boolean Obser){
            this.Nombre = Nombre;
            this.Satelites = Satelites;
            this.Masa = Masa;
            this.Volumen = Volumen;
            this.Diametro = Diametro;
            this.tipo = tipo;
            this.DistS = DistS;
            Obser = Obser;
        }
        public void Mostrar(){
            System.out.println(Nombre);
            System.out.println("Satelites Orbitando " + Satelites);
            System.out.println("Masa " + Masa + " Volumen " + Volumen + " Diametro " + Diametro);
            System.out.println("Tipo " + tipo);
            System.out.println("Observable " + Obser);
            System.out.println("Distamcoa del sol " + DistS + "Ua");
        }
        public void Densidad (){
            System.out.println("La densidad es " + Masa/Volumen);
        }
        public void Fuera (){
            if (DistS > 30){
                System.out.println("Planeta externo al sistema solar");
            }else {
                System.out.println("Pertenese al sistema solar");
            }
        }

        public void setDistS(int distS) {
            DistS = distS;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public void setSatelites(int satelites) {
            Satelites = satelites;
        }

        public void setMasa(double masa) {
            Masa = masa;
        }

        public void setVolumen(double volumen) {
            Volumen = volumen;
        }

        public void setTipo(Tipo tipo) {
            this.tipo = tipo;
        }

        public void setDiametro(int diametro) {
            Diametro = diametro;
        }

        public void setObser(Boolean obser) {
            Obser = obser;
        }
}