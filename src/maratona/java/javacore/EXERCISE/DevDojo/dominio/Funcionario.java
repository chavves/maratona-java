package maratona.java.javacore.EXERCISE.DevDojo.dominio;

import java.util.Locale;
import java.util.Scanner;


// AULA 53
public class Funcionario {
    private String nome;
    private int idade;
    private double salarioA, salarioB, salarioC;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalarioA() {
        return salarioA;
    }

    public double getSalarioB() {
        return salarioB;
    }

    public double getSalarioC() {
        return salarioC;
    }

    public void setSalarioA(double salarioA) {
        this.salarioA = salarioA;
    }

    public void setSalarioB(double salarioB) {
        this.salarioB = salarioB;
    }

    public void setSalarioC(double salarioC) {
        this.salarioC = salarioC;
    }

    // Metodo para ler os dados do usuario

    public void lerDados() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite seu nome: ");
        this.nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        this.idade = sc.nextInt();

        System.out.print("Digite o primeiro salário: ");
        this.salarioA = sc.nextDouble();

        System.out.print("Digite o segundo salário: ");
        this.salarioB = sc.nextDouble();

        System.out.print("Digite o terceiro salário: ");
        this.salarioC = sc.nextDouble();

    }

    public double calcularMedia() {
        return (salarioA + salarioB + salarioC) / 3;
    }
}