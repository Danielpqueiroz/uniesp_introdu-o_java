package app;

import entidade.Carro;
import entidade.Roda;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        /*int ano = sc.nextInt();
        String modelo =sc.nextLine();*/

        Carro carro1 = new Carro(1987,"fusca");

        Roda roda =  new Roda("Dunlop", 15);
        carro1.setRoda(roda);

        System.out.println("O aro da roda é: " + carro1.getRoda().getAro());

    }
}
