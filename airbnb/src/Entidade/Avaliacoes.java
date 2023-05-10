package Entidade;

public abstract class Avaliacoes extends  Propriedade{
    private String propriadadeAvaliada;
    private String hospedeAvaliacao;
    private int notaAvaliacao;
    private String comentario;
    private Double mediaNotas;

    public Avaliacoes(String propriadadeAvaliada, String hospedeAvaliacao, int notaAvaliacao, String comentario, Double mediaNotas) {
        this.propriadadeAvaliada = propriadadeAvaliada;
        this.hospedeAvaliacao = hospedeAvaliacao;
        this.notaAvaliacao = notaAvaliacao;
        this.comentario = comentario;
        this.mediaNotas = mediaNotas;
    }

    public String getPropriadadeAvaliada() {
        return propriadadeAvaliada;
    }

    public void setPropriadadeAvaliada(String propriadadeAvaliada) {
        this.propriadadeAvaliada = propriadadeAvaliada;
    }

    public String getHospedeAvaliacao() {
        return hospedeAvaliacao;
    }

    public void setHospedeAvaliacao(String hospedeAvaliacao) {
        this.hospedeAvaliacao = hospedeAvaliacao;
    }

    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(Double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }
}
