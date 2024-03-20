import java.sql.SQLOutput;

public class Testadora {
    //Método main é necessário para executar o programa em Java.
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");//Os tipos wrapper se não for colocado o valor da variavel ficará como zero e não vazio.
        String nome = "Daniel";
        int idade = 28;
        double altura = 1.70;
        double peso = 60;
        boolean fumante = false;

        //Respostas
        boolean praticaAtividade = true;
        int atividadeSemana = 4;
        boolean dorSentida = true;
        int intensidadeDor = 8;

        if (praticaAtividade == true){
            System.out.println("O paciente pratica atividade física!");
            if (atividadeSemana > 3){
                System.out.println("Boa quantidade de endorfina");

            }else{
                System.out.println("Precisa melhorar");
            }
        }
        if (dorSentida == true){
            System.out.println("O paciente sente dor!");
            if (intensidadeDor > 5) {
                System.out.println("Sente uma dor muito forte!");
            } else {
                System.out.println("Vamos tratar com medicamento!");
            }
        }
    }
}
