package q14;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);
        idade = dataAtual.minusYears(dataNascimento.getYear()).getYear();
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        diaNascimento = dia;
        mesNascimento = mes;
        anoNascimento = ano;
    }
}

