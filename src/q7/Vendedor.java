package q7;

class Vendedor extends Empregado {
    private float percentualComissao;

    public Vendedor(String nome, float salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public float calcularSalario() {
        return salario + (salario * percentualComissao / 100);
    }

    public String toString() {
        float salarioComComissao = calcularSalario();
        return "Nome: " + getNome() + ", Salário sem comissão: " + salario + ", Salário com comissão: "
                + salarioComComissao + ", Percentual de comissão: " + percentualComissao + "%";
    }
}

