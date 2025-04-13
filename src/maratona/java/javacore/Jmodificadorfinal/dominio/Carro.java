package maratona.java.javacore.Jmodificadorfinal.dominio;

public class Carro {
    public static final double VELOCIDADE_LIMITE = 250;
    private String nome;
    public final Comprador COMPRADOR = new Comprador();

    public final void info(){
        System.out.println(this.nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
