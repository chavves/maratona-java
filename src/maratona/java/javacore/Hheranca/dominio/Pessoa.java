package maratona.java.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + " ");
        System.out.println("CEP: " + this.endereco.getCep() + " ");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
