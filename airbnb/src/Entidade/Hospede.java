package Entidade;

public class Hospede extends  Usuarios {
    private  String listaImoveisFavoritos;

    public Hospede(String nome, String email, int telefone, String senha, String listaImoveisFavoritos) {
        super(nome, email, telefone, senha);
        this.listaImoveisFavoritos = listaImoveisFavoritos;
    }

    public String getListaImoveisFavoritos() {
        return listaImoveisFavoritos;
    }

    public void setListaImoveisFavoritos(String listaImoveisFavoritos) {
        this.listaImoveisFavoritos = listaImoveisFavoritos;
    }
}
