package q10;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", "Rua A", "123456789", 123, 2000.0, 10.0);
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
    }
}
