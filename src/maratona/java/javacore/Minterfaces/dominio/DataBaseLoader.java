package maratona.java.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover { // ← Quando estamos trabalhando com interface, usamos o implements e não o extends \\

    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");

    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de Dados");
    }
    @Override
    public void checkPermition() {
        System.out.println("Checando permissões no banco de dados");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe");
    }

    public void loadAndRemoveAndCheck() {
        load();
        remove();
        checkPermition();
    }


}
