package q5;

public class Contato {
    private int codigo;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String observacao;

    public Contato(int codigo) {
        this.codigo = validarCodigo(codigo);
    }

    public Contato(int codigo, String nome) {
        this.codigo = validarCodigo(codigo);
        this.nome = nome;
    }

    public Contato(int codigo, String nome, String email) {
        this.codigo = validarCodigo(codigo);
        this.nome = nome;
        this.email = email;
    }

    public Contato(String telefone) {
        this.telefone = validarTelefone(telefone);
    }

    public void imprimirContato() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Observação: " + observacao);
    }

    private int validarCodigo(int codigo) {
        if (codigo >= 1000 && codigo <= 9999) {
            return codigo;
        } else {
            System.out.println("Código inválido. O código deve ser maior ou igual a 1000 e menor ou igual a 9999.");
            return 0;
        }
    }

    private String validarTelefone(String telefone) {
        if (telefone.length() == 8) {
            return telefone;
        } else {
            System.out.println("Telefone inválido. O telefone deve ter 8 dígitos.");
            return "";
        }
    }

    public Contato duplicarContato() {
        Contato novoContato = new Contato(codigo, nome, email);
        novoContato.setEndereco(endereco);
        novoContato.setTelefone(telefone);
        novoContato.setObservacao(observacao);
        return novoContato;
    }

    public boolean contatoPreenchido() {
        return (codigo != 0 && nome != null && endereco != null && email != null && telefone != null && observacao != null);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = validarCodigo(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail (String email) {
    	this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = validarTelefone(telefone);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}

