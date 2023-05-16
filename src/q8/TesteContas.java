package q8;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1000);
        System.out.println("Saldo conta1: " + conta1.getSaldo());
        conta1.depositar(500);
        System.out.println("Saldo conta1 após depósito: " + conta1.getSaldo());
        boolean saque1 = conta1.sacar(1500);
        System.out.println("Saque 1 conta1: " + saque1);
        System.out.println("Saldo conta1 após saque: " + conta1.getSaldo());

        ContaEspecial conta2 = new ContaEspecial(2000, 1000);
        System.out.println("Saldo conta2: " + conta2.getSaldo());
        System.out.println("Limite de crédito conta2: " + conta2.getLimiteCredito());
        conta2.depositar(800);
        System.out.println("Saldo conta2 após depósito: " + conta2.getSaldo());
        boolean saque2 = conta2.sacar(3500);
        System.out.println("Saque 2 conta2: " + saque2);
        System.out.println("Saldo conta2 após saque: " + conta2.getSaldo());
    }
}
