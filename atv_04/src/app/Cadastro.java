package app;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {

    public static final double IMPOSTO = 0.20;
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(("Quantos funcionarios serão cadastrados: "));
        int n = sc.nextInt();

        String[] codigo = new String[n];
        String[] nome = new String[n];
        String[] email = new String[n];
        double[] salario = new double[n];
        double[] aumento = new double[n];
        double[] novoSalario = new double[n];
        double[] imp = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados do " + (i + 1) + "° funcionario: ");
            System.out.print("Codigo: ");
            codigo[i] = sc.next();
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Email: ");
            email[i] = sc.next();
            System.out.print("Salário: ");
            salario[i] = sc.nextDouble();
            System.out.print("Aumento: ");
            aumento[i] = sc.nextDouble();
            novoSalario[i] = salario[i] + (salario[i]*(aumento[i]/100));
            System.out.println("Seu novo salário é; "+ novoSalario[i]);
            imp[i] = imposto(novoSalario[i]);
            System.out.println("Valor a ser descontado de imposto é: "+ imp[i]);
        }

        sc.close();
    }
    public static double imposto(double s ){
        return s * IMPOSTO;
    }
}
