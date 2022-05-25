public class Coche {
    private int puertas;
    public  Coche(int cantPuertas){
        this.puertas = cantPuertas;
        System.out.println("Creaste un auto con "+puertas+" puertas");
    }
    public  Coche(){};

    public void agregarPuerta (){
        puertas ++;
    }
    public int getPuertas () {
        return puertas;
    }
}