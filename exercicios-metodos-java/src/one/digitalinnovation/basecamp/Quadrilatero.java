package one.digitalinnovation.basecamp;

public class Quadrilatero {

    public static double area(double lado){
        //System.out.println("Área do quadrado: " + lado * lado);
        return lado * lado;

    }

    public static double area(double lado1, double lado2){
        //System.out.println("Área do retângulo: " + lado1 * lado2);
        return lado1 * lado2;

    }

    public static double area(double baseMaior, double baseMenor, double altura){
        //System.out.println("Área do trapézio: " + (baseMaior + baseMenor)*altura/2 );
        return ((baseMaior+baseMenor)*altura) / 2;
    }

    public static void xpto() {
        System.out.println("Antes");
        return;
    }

    public static double abc() {
        return 1.6;
    }

}
