package q11_12;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Um", "Rua A, 123", "1234-5678", 1, 1500.0, 10.0, 5000.0, 5.0);
        
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: R$" + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor de Produção: R$" + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário: R$" + operario.calcularSalario());
    }
}

