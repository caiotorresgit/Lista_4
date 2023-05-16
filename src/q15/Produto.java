package q15;


public class Produto {
    private String nomeProduto;
    private double precoCusto;
    private double precoVenda;
    private double despesas;

    public Produto(String nomeProduto, double precoCusto, double precoVenda, double despesas) {
        this.nomeProduto = nomeProduto;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.despesas = despesas;
    }

    public void calculaMargemLucro() {
        double margemLucro = ((precoVenda - (precoCusto + despesas)) / precoVenda) * 100;
        System.out.println("Margem de Lucro: " + margemLucro + "%");
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Produto A", 50.0, 80.0, 10.0);
        produto.calculaMargemLucro();
    }
}

