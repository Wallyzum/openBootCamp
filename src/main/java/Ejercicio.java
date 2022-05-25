import java.awt.*;

public class Ejercicio {


    public static void main(String[] args) {
        suma(15,20,45);
        Coche car = new Coche(2);
        car.agregarPuerta();
        car.agregarPuerta();
        System.out.println(car.getPuertas());

    }
    public static void suma(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
