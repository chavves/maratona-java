package maratona.java.javacore.Hheranca.test;

import maratona.java.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // Ordem:
    // 0 - Bloco de inicialização static da super-classe é executado quando a JVM carregar a classe PAI
    // 1 - Bloco de inicialização static da subclasse é executado quando a JVM carregar a classe FILHA
    // 2 - Alocado espaço em memória para o objeto da super-classe
    // 3 - Cada atributo de super-classe é criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
    // 5 - Construtor é executado da super classe
    // 6 - Alocado espaço em memória para o objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Seu Madruga");
    }
}
