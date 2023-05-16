package q5;

public class Main {
    public static void main(String[] args) {
    	
        Contato contato1 = new Contato(1001);
        Contato contato2 = new Contato(1002, "Kaique");
        Contato contato3 = new Contato(1003, "Ismael", "Ismael@exemplo.com");
        Contato contato4 = new Contato("12345678");


        contato1.setNome("Um");
        contato1.setEndereco("Rua A, 123");
        contato1.setTelefone("98765432");
        contato1.setObservacao("Amigo");

        contato2.setEndereco("Rua B, 456");
        contato2.setEmail("kaique@example.com");
        contato2.setTelefone("87654321");

        contato3.setEndereco("Rua C, 789");
        contato3.setTelefone("76543210");

        contato4.setNome("Bruno");
        contato4.setEndereco("Rua D, 987");
        contato4.setEmail("bruno@exemplo.com");
        contato4.setObservacao("Cliente");

        
        contato1.imprimirContato();
        System.out.println();
        contato2.imprimirContato();
        System.out.println();
        contato3.imprimirContato();
        System.out.println();
        contato4.imprimirContato();

       
        Contato contatoDuplicado = contato3.duplicarContato();
        System.out.println();
        System.out.println("Contato duplicado:");
        contatoDuplicado.imprimirContato();

        
        System.out.println();
        System.out.println("Contato 1 preenchido? " + contato1.contatoPreenchido());
        System.out.println("Contato 2 preenchido? " + contato2.contatoPreenchido());
        System.out.println("Contato 3 preenchido? " + contato3.contatoPreenchido());
        System.out.println("Contato 4 preenchido? " + contato4.contatoPreenchido());
    }
}

