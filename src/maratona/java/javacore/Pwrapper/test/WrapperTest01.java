package maratona.java.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; // autoboxing: Quando tem um tipo primitivo e o Java faz a conversão automaticamente para um Wrapper
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxin: Converte do wrapper para o tipo primitivo, ou seja "int"
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean(null);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

    }
}
