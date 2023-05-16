package q13;

public class ControleRemoto {
    private boolean tvLigada;
    private int volume;
    private int canal;

    public ControleRemoto() {
        tvLigada = false;
        volume = 0;
        canal = 1;
    }

    public void ligarDesligarTV() {
        tvLigada = !tvLigada;
        if (tvLigada) {
            System.out.println("TV ligada.");
        } else {
            System.out.println("TV desligada.");
        }
    }

    public void aumentarVolume() {
        if (tvLigada) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        }
    }

    public void diminuirVolume() {
        if (tvLigada) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume diminuído para: " + volume);
            } else {
                System.out.println("O volume já está no mínimo.");
            }
        }
    }

    public void aumentarCanal() {
        if (tvLigada) {
            canal++;
            System.out.println("Canal aumentado para: " + canal);
        }
    }

    public void diminuirCanal() {
        if (tvLigada) {
            if (canal > 1) {
                canal--;
                System.out.println("Canal diminuído para: " + canal);
            } else {
                System.out.println("O canal já está no mínimo.");
            }
        }
    }

    public void trocarCanal(int novoCanal) {
        if (tvLigada) {
            if (novoCanal >= 1) {
                canal = novoCanal;
                System.out.println("Canal alterado para: " + canal);
            } else {
                System.out.println("Canal inválido.");
            }
        }
    }

    public void consultarVolumeECanal() {
        if (tvLigada) {
            System.out.println("Volume: " + volume);
            System.out.println("Canal: " + canal);
        }
    }

    public void mute() {
        if (tvLigada) {
            volume = 0;
            System.out.println("Mute ativado. Volume: " + volume);
        }
    }
}

