package q9;

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public void imprimirNome() {
        System.out.println("Círculo");
    }
}
