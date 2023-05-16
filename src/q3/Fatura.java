package q3;

public class Fatura {
    private int numeroItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private double precoUnitario;
    private double precoTotal;

    public Fatura(int numeroItem, String descricaoItem, int quantidadeComprada, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
        calcularPrecoTotal();
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
        calcularPrecoTotal();
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
        calcularPrecoTotal();
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    private void calcularPrecoTotal() {
        precoTotal = quantidadeComprada * precoUnitario;
    }

    public double getValorFatura() {
        return precoTotal;
    }

    public void aplicarDesconto(double percentualDesconto) {
        if (percentualDesconto >= 0 && percentualDesconto <= 100) {
            double desconto = precoTotal * (percentualDesconto / 100);
            precoTotal -= desconto;
        }
    }
}

