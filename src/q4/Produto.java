package q4;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private boolean foiComprado;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.foiComprado = false;
    }

    public void comprarProduto() {
        foiComprado = true;
        double valorTotal = preco * quantidade;
        double desconto = 0.0;

        if (valorTotal > 500) {
            desconto = valorTotal * 0.25;
        } else if (valorTotal > 200) {
            desconto = valorTotal * 0.20;
        } else if (valorTotal > 100) {
            desconto = valorTotal * 0.10;
        }

        double valorFinal = valorTotal - desconto;
        System.out.println("Produto comprado: " + nome);
        System.out.println("Valor total a ser pago: R$" + valorFinal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean foiComprado() {
        return foiComprado;
    }
}
