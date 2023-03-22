public class App {

    public static void main(String[] args) {

        ContaLogin cl1 = new ContaLogin("mrb@gmail.com");
        ContaLogin cl2 = new ContaLogin("messi@iesp.edu.br", "a1b2c3d4");
        ContaLogin cl3 = new ContaLogin();

        cl1.setNome("Messi", 10);

//        cl2.setNome("MRB");
//        cl3.setNome("Messias");

        System.out.println("CL1: " + cl1.getNome());
//        System.out.println("CL2: " + cl2.getNome());
//        System.out.println("CL3: " + cl3.getNome());

    }

}