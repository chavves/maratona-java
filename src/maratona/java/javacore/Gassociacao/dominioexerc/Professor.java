package maratona.java.javacore.Gassociacao.dominioexerc;

import maratona.java.javacore.Gassociacao.dominio.Jogador;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("------------------------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("Área: " + this.especialidade);
        System.out.println("## Seminários ##");
        for (Seminario seminario : seminarios) {
            System.out.println("- " + seminario.getTitulo() + " na " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null) return;
            System.out.println("** Alunos inscritos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("-- Nome: " + aluno.getNome() + " Idade: " + aluno.getIdade());
            }
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

