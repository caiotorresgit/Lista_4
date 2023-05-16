package q9;

public class TesteFormas {
    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.imprimirNome();
        System.out.println("Área: " + forma.calcularArea());

        Circulo circulo = new Circulo(5);
        circulo.imprimirNome();
        System.out.println("Área: " + circulo.calcularArea());

        Retangulo retangulo = new Retangulo(4, 6);
        retangulo.imprimirNome();
        System.out.println("Área: " + retangulo.calcularArea());

        Quadrado quadrado = new Quadrado(3);
        quadrado.imprimirNome();
        System.out.println("Área: " + quadrado.calcularArea());

        Triangulo triangulo = new Triangulo(5, 8);
        triangulo.imprimirNome();
        System.out.println("Área: " + triangulo.calcularArea());
    }
}
