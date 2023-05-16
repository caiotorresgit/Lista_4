package q2;

public class Main {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 5000.0);
        Empregado empregado2 = new Empregado("Maria", "Santos", 6000.0);

        System.out.println("Salário anual do empregado 1: " + empregado1.getSalarioAnual());
        System.out.println("Salário anual do empregado 2: " + empregado2.getSalarioAnual());

        empregado1.aplicarAumentoSalario();
        empregado2.aplicarAumentoSalario();

        System.out.println("Salário anual após o aumento do empregado 1: " + empregado1.getSalarioAnual());
        System.out.println("Salário anual após o aumento do empregado 2: " + empregado2.getSalarioAnual());
    }
}
