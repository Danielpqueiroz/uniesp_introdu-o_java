public class App {
    public static void main(String[] args) {
        ContaLogin cl1 = new ContaLogin();
        ContaLogin cl2 = new ContaLogin();
        ContaLogin cl3 = new ContaLogin();
        System.out.println("Olá mundo!");


        cl1.setNome("Daniel Pontes", 10);
        //cl2.setNome("MRB");
        //cl3.setNome("Messias");

        System.out.println("CL1:" + cl1.getNome());
        //System.out.println("CL2:" + cl2.getNome());
        //System.out.println("CL3:" + cl3.getNome());

    }
}
