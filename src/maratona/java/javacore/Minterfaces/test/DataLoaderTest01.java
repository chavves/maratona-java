package maratona.java.javacore.Minterfaces.test;

import maratona.java.javacore.Minterfaces.dominio.DataBaseLoader;
import maratona.java.javacore.Minterfaces.dominio.DataLoader;
import maratona.java.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader databaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.loadAndRemoveAndCheck();
        fileLoader.loadAndRemoveAndCheck();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();

    }
}
