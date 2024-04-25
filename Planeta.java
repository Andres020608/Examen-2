public class Planeta {

    String nombre="";
    int cantidad_satelites;
    double masa;
    double volumen;
    double diametro;
    double distancia_al_sol;
    boolean observable;
    public Planeta(String nombre, int cantidad_satelites, double masa, double volumen, double diametro,
            double distancia_al_sol, boolean observable) {
        this.nombre = nombre;
        this.cantidad_satelites = cantidad_satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_al_sol = distancia_al_sol;
        this.observable = observable;
    }

    public double calcular_densidad(){
        return masa/volumen;
    }

    public void imprimir(){
        System.out.println("Nombre = "+ nombre);
        System.out.println("cantidad de satelites = "+ cantidad_satelites);
        System.out.println("Masa = "+ masa);
        System.out.println("Volumen = "+volumen );
        System.out.println("Denisdad = "+ calcular_densidad());
        System.out.println("Diametro = "+ diametro+ " kilometros");
        System.out.println("Distancia al sol = "+ distancia_al_sol +"kilometros");
        System.out.println("¿Observable? = " + observable);
        System.out.println("");
    }
    public static void main(String[] args) {
      Planeta planeta1 = new Planeta("Tierra",1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
      System.out.println("Datos del planeta 1 :");
      planeta1.imprimir();

      Planeta planeta2 = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);
      System.out.println("Datos del planeta 2 : ");
      planeta2.imprimir();
    }

}