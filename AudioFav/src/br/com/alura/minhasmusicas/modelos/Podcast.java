package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String previsao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getPrevisao() {
        return previsao;
    }

    public void setPrevisao(String previsao) {
        this.previsao = previsao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 10) {
            return 10;
        } else {
            return 8;
        }
    }
}