package q4;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 1000, 2);
        Produto produto2 = new Produto("Notebook", 800, 1);
        Produto produto3 = new Produto("Mouse", 50, 5);

        produto1.comprarProduto();
        produto2.comprarProduto();
        produto3.comprarProduto();
    }
}

