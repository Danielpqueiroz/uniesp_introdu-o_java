import javax.swing.*;
import java.util.Scanner;

public class TestadoraScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome abaixo: ");
        String nome = sc.nextLine();
        System.out.println("Seu nome é: " + nome);
        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();
        System.out.println("E sua idade é; " + idade);
        // Java Swing
        String nome2 = JOptionPane.showInputDialog(null,"Digite seu nome: ");
        JOptionPane.showMessageDialog(null, nome2);
    }
}
