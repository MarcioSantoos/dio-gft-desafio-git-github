package one.digitalinnovation.basecamp;

public class Calculadora {

    public static void somar(double x, double y){
        double soma = x + y;
        System.out.println("A soma: " + soma);
    }

    public static void subtrair(double x, double y){
        double subtrai = x - y;
        System.out.println("A subtração: " + subtrai);
    }

    public static void dividir(double x, double y){
        double divisao = x / y;
        System.out.println("A divisão: " + divisao);
    }

    public static void multiplicar(double x, double y){
        double multiplicacao = x * y;
        System.out.println("A multiplicação: " + multiplicacao);
    }
}
