package maratona.java.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void info() {
        System.out.println("Imprimindo...");
    }

    @Override
    public void calculaBonus() {
        salario *= 1.2;
    }
}
