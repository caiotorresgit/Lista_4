package q6;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<Ingresso> ingressos;

    public Evento() {
        ingressos = new ArrayList<>();
    }

    public void venderIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public double calcularValorTotalIngressosVendidos() {
        double valorTotal = 0;
        for (Ingresso ingresso : ingressos) {
            valorTotal += ingresso.getValor();
        }
        return valorTotal;
    }

    public List<Ingresso> getIngressosNaoVendidos() {
        List<Ingresso> ingressosNaoVendidos = new ArrayList<>();
        for (Ingresso ingresso : ingressos) {
            if (ingresso.getValor() > 0) {
                ingressosNaoVendidos.add(ingresso);
            }
        }
        return ingressosNaoVendidos;
    }
}

