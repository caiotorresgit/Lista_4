package q6;

public class TesteIngresso {
    public static void main(String[] args) {
        Ingresso ingressoComum = new Ingresso(50.0);
        System.out.println(ingressoComum);

        IngressoVIP ingressoVIP = new IngressoVIP(100.0, 50.0);
        System.out.println(ingressoVIP);

        Ingresso ingressoPolimorfico = ingressoVIP;
        System.out.println(ingressoPolimorfico);
    }
}

