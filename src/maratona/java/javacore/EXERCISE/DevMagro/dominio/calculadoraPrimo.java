package maratona.java.javacore.EXERCISE.DevMagro.dominio;

public class calculadoraPrimo {
    public static boolean isPrimo(int valores) {
        if (valores < 2){
            return false;
        }
        for (int i = 2; i < valores; i++){
            if (valores % i == 0){
                return false;
            }
        }
        return true;
    }
}
