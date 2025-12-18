package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String nome;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }


    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalReproducoes++;
    }
}
