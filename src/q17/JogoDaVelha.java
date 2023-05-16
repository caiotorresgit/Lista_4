package q17;

import java.util.Scanner;

public class JogoDaVelha {
    private String[][] grade;
    private String jogadorAtual;

    public JogoDaVelha() {
        grade = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grade[i][j] = " ";
            }
        }
        jogadorAtual = "Jogador 1";
    }

    public void exibirGrade() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grade[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    public boolean verificarVitoria() {
        for (int i = 0; i < 3; i++) {
            if (grade[i][0].equals(grade[i][1]) && grade[i][1].equals(grade[i][2]) && !grade[i][0].equals(" ")) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (grade[0][j].equals(grade[1][j]) && grade[1][j].equals(grade[2][j]) && !grade[0][j].equals(" ")) {
                return true;
            }
        }

        if (grade[0][0].equals(grade[1][1]) && grade[1][1].equals(grade[2][2]) && !grade[0][0].equals(" ")) {
            return true;
        }

        if (grade[0][2].equals(grade[1][1]) && grade[1][1].equals(grade[2][0]) && !grade[0][2].equals(" ")) {
            return true;
        }

        return false;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        boolean jogoAcabou = false;
        int jogadasRealizadas = 0;

        while (!jogoAcabou) {
            System.out.println("Turno do " + jogadorAtual);
            System.out.print("Informe a linha (0 a 2): ");
            int linha = scanner.nextInt();
            System.out.print("Informe a coluna (0 a 2): ");
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2 && grade[linha][coluna].equals(" ")) {
                grade[linha][coluna] = jogadorAtual.equals("Jogador 1") ? "X" : "O";
                exibirGrade();
                jogadasRealizadas++;

                if (verificarVitoria()) {
                    System.out.println("O " + jogadorAtual + " venceu!");
                    jogoAcabou = true;
                } else if (jogadasRealizadas == 9) {
                    System.out.println("Empate!");
                    jogoAcabou = true;
                } else {
                    jogadorAtual = jogadorAtual.equals("Jogador 1") ? "Jogador 2" : "Jogador 1";
                }
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }
    }

    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.jogar();
    }
}

