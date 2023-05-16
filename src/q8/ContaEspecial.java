package q8;


class ContaEspecial extends ContaCorrente {
    private float limiteCredito;

    public ContaEspecial(float saldo, float limiteCredito) {
        super(saldo);
        this.limiteCredito = limiteCredito;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public boolean sacar(float valor) {
        float saldoDisponivel = saldo + limiteCredito;
        if (valor <= saldoDisponivel) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
