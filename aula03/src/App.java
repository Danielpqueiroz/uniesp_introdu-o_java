public class App {

    public static void main(String[] args) {

        ContaLogin cl1 = new ContaLogin("dpq@gmail.com");
        ContaLogin cl2 = new ContaLogin("daniel@iesp.edu.br", "a1b2c3d4");
        ContaLogin cl3 = new ContaLogin();

        cl1.setNome("Daniel", 10);

//        cl2.setNome("DPQ");
//        cl3.setNome("Daniel");

        System.out.println("CL1: " + cl1.getNome());
//        System.out.println("CL2: " + cl2.getNome());
//        System.out.println("CL3: " + cl3.getNome());

    }

}