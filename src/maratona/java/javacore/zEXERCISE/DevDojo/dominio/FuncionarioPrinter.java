package maratona.java.javacore.zEXERCISE.DevDojo.dominio;

public class FuncionarioPrinter {
    public void exibirDados(Funcionario funcionario) {
        System.out.println("\n===== DADOS DO FUNCIONÁRIO =====");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.printf("Média salarial: %.3f", funcionario.calcularMedia());
    }
}