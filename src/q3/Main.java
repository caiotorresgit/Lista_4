package q3;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(1, "Teclado", 2, 50.0);

        System.out.println("Valor da fatura: " + fatura.getValorFatura());

        fatura.aplicarDesconto(10.0);

        System.out.println("Valor da fatura com desconto: " + fatura.getValorFatura());
    }
}

