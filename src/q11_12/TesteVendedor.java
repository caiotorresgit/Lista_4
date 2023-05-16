package q11_12;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Dois", "Rua A, 123", "1234-5678", 1, 2000.0, 10.0, 5000.0, 2.5);
        
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: R$" + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor de Vendas: R$" + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário: R$" + vendedor.calcularSalario());
    }
}

