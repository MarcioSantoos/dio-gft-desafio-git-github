package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {
        //Mensagens
        Mensagem.hora(8);
        Mensagem.hora(13);
        Mensagem.hora(3);
        System.out.println("\n");
        //Calculadora
        Calculadora.somar(10,90);
        Calculadora.subtrair(100,10);
        Calculadora.dividir(100, 10);
        Calculadora.multiplicar(10,10);
        System.out.println("\n");
        //Emprestimo
        Emprestimo.calcular(2000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(2000, 2);
    }
}
