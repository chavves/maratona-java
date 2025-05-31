package maratona.java.javacore.Oexception.exception.test;

import maratona.java.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException{
        Scanner input = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário: ");
        String usernameDigitado = input.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = input.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senhaDigitada.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou Senha inválidos.");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
