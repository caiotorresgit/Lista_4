package q7;

public class TesteClasses {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Um", 3000);
        System.out.println(empregado);

        Gerente gerente = new Gerente("Dois", 9000, "RH");
        System.out.println(gerente);

        Vendedor vendedor = new Vendedor("Três", 1500, 10);
        System.out.println(vendedor);
    }
}
