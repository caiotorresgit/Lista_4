package q16;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public void inicializa(int capacidade, int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador. Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("O elevador está cheio. Não é possível entrar mais pessoas.");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador. Total de pessoas: " + pessoasPresentes);
        } else {
            System.out.println("O elevador está vazio. Não há pessoas para sair.");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no último andar. Não é possível subir mais.");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar " + andarAtual);
        } else {
            System.out.println("O elevador já está no térreo. Não é possível descer mais.");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializa(8, 12);
        elevador.entra();
        elevador.sobe();
        elevador.entra();
        elevador.sobe();
        elevador.entra();
        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.desce();
        elevador.desce();
    }
}
