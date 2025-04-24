package br.com.ocauamotta;

/**
 * @author Cauã Motta
 */

// Representa uma televisão com funções simples
public class Televisao {
    // Atributos da TV
    private boolean ligada;
    private int canalAtual;
    private int volume;

    // Constantes para definir os limites
    private final int CANAL_MINIMO = 1;
    private final int CANAL_MAXIMO = 99;
    private final int VOLUME_MINIMO = 0;
    private final int VOLUME_MAXIMO = 100;

    // Construtor padrão, a TV inicia desligada.
    public Televisao() {
        this.ligada = false;
        this.canalAtual = CANAL_MINIMO;
        this.volume = 10;
    }

    // Método para obter se a TV está ligada ou desligada
    private boolean getLigada() {
        return ligada;
    }

    // Método para ligar ou desligar a TV
    private void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    // Método para obter o canal a ser exibido
    private int getCanalAtual() {
        return canalAtual;
    }

    // Método para definir o canal a ser exibido
    private void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    // Método para obter o volume da TV
    private int getVolume() {
        return volume;
    }

    // Método para definir o volume da TV
    private void setVolume (int volume) {
        this.volume = volume;
    }

    // Método para exibir o canal atual
    public void exibeCanal() {
        if (getLigada()) {
            System.out.println("O canal que você está assistindo é: " + getCanalAtual());
        } else {
            System.out.println("TV desligada.");
        }
    }

    // Método para exibir o volume atual
    public void exibeVolume() {
        if (getLigada()) {
            System.out.println("Volume atual: " + getVolume());
        } else {
            System.out.println("TV desligada.");
        }
    }

    // Método para ligar a TV
    public void ligarTv() {
        setLigada(true);
        System.out.println("TV ligada.");
        exibeCanal();
        exibeVolume();
    }

    // Método para desligar a TV
    public void desligarTv() {
        setLigada(false);
        System.out.println("TV desligada.");
    }

    // Método para avançar o canal da TV
    public void avancarCanal() {
        if (getLigada()) {
            if (getCanalAtual() < CANAL_MAXIMO) {
                setCanalAtual(getCanalAtual() + 1);
            } else {
                setCanalAtual(1);
            }
            exibeCanal();
        } else {
            System.out.println("Ligue a TV para mudar de canal.");
        }
    }

    // Método para retornar o canal da TV
    public void voltarCanal() {
        if (getLigada()) {
            if (getCanalAtual() > CANAL_MINIMO) {
                setCanalAtual(getCanalAtual() - 1);
            } else {
                setCanalAtual(99);
            }
            exibeCanal();
        } else {
            System.out.println("Ligue a TV para mudar de canal.");
        }
    }

    // Método para aumentar o volume da TV
    public void aumentarVolume () {
        if (getLigada()) {
            if (getVolume() < VOLUME_MAXIMO) {
                setVolume(getVolume() + 1);
                exibeVolume();
            } else {
                System.out.println(getVolume() + " - Volume Máximo!");
            }
        } else {
            System.out.println("Ligue a TV para ajustar o volume.");
        }
    }

    // Método para diminuir o volume da TV
    public void diminuirVolume () {
        if (getLigada()) {
            if (getVolume() > VOLUME_MINIMO) {
                setVolume(getVolume() - 1);
                exibeVolume();
            } else {
                System.out.println(getVolume() + " - Volume Minímo!");
            }
        } else {
            System.out.println("Ligue a TV para ajustar o volume.");
        }
    }
}
