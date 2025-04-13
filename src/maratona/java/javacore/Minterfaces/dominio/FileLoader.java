package maratona.java.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");

    }
    @Override
    public void checkPermition() {
        System.out.println("Checando permissões no arquivo");
    }
    public void loadAndRemoveAndCheck() {
        load();
        remove();
        checkPermition();
    }

}
