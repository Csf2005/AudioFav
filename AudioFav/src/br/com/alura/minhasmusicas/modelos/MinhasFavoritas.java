package br.com.alura.minhasmusicas.modelos;

public class MinhasFavoritas {

    public void inclui(Audio audio){
        if (audio.getClassificacao()>= 9){
            System.out.println(audio.getNome()+ " é considerado o maior sucesso por muitos!");
        } else {
            System.out.println(audio.getNome()+ " Escute depois!");
        }
    }
}
