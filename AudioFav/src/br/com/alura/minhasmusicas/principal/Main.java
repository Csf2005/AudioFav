package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasFavoritas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    static void main() {
        Musica minhaMusica = new Musica();
        minhaMusica.setNome("04AM");
        minhaMusica.setCantor("Matue");

        for (int i = 0; i < 2000 ; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50 ; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setNome("PodPah");
        meuPodcast.setApresentador("Igão e Mitico");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasFavoritas favoritas = new MinhasFavoritas();
        favoritas.inclui(meuPodcast);
        favoritas.inclui(minhaMusica);

    }
}
