package Entidade;

import java.util.ArrayList;

public abstract class ListagemPropriedade {
    public String rua;
    public String numero;
    public String cidade;
    public String pais;
    public int numeroQuartos;
    public Double preco;
    private  Double mediaAvaliacao;

    ArrayList<String> listaReservados = new ArrayList<String>();
    ArrayList<String> listaAvaliacoes = new ArrayList<String>();

    public ListagemPropriedade(String rua, String numero, String cidade, String pais, int numeroQuartos, Double preco) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.pais = pais;
        this.numeroQuartos = numeroQuartos;
        this.preco = preco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(Double mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public ArrayList<String> getListaReservados() {
        return listaReservados;
    }

    public void setListaReservados(ArrayList<String> listaReservados) {
        this.listaReservados = listaReservados;
    }

    public ArrayList<String> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void setListaAvaliacoes(ArrayList<String> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }
}
