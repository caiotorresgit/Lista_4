package q9;

class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public void imprimirNome() {
        System.out.println("Quadrado");
    }
}