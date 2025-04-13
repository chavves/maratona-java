package maratona.java.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load(); // Não precisa colocar "public abstract". É uma regra padrão das Interfaces no JAVA! \\
    public default void checkPermition(){
        System.out.println("Fazendo Checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }

}
