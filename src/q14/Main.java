package q14;

public class Main {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        int diaAtual = 15;
        int mesAtual = 5;
        int anoAtual = 2023;

        einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println("Idade de Albert Einstein: " + einstein.informaIdade());
        System.out.println("Idade de Isaac Newton: " + newton.informaIdade());
    }
}

