package maratona.java.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com Sucesso " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;

        }
    }
}
