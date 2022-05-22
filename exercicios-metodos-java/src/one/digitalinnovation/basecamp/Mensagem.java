package one.digitalinnovation.basecamp;

public class Mensagem {

    public static void hora(int horario){
        if (horario >= 5 && horario <= 12) {
            mensagemBomDia();
        } else if (horario > 12 && horario <= 18) {
            mensagemBoaTarde();
        } else {
            mensagemBoaNoite();
        }
    }

    public static void mensagemBomDia(){
        System.out.println("Bom dia");
    }
    public static void mensagemBoaTarde(){
        System.out.println("Boa tarde");
    }
    public static void mensagemBoaNoite(){
        System.out.println("Boa noite");
    }
}
