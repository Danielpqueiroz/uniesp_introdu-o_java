package app;

import entidades.Triangulo;

public class App {
    public static void main(String[] args) {

        Triangulo tri = new Triangulo(3.5, 4.0, 5.0);

        System.out.println("O valor de P: " + tri.calcularP());
        System.out.println("O valor da área: " + tri.calcularArea());

        Triangulo tri2 = new Triangulo(7.5, 4.5, 4.02);
        System.out.println(tri2.calcularP());
        System.out.println(tri2.calcularArea());

        if (tri.calcularArea() > tri2.calcularArea()) {
            System.out.println("O valor de tri é maior que tri2");
        } else {
            System.out.println("O valor de tri2 é maior do que tri");
        }


    }

}
