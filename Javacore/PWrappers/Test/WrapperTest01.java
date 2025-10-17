package MaratonaJava.Javacore.PWrappers.Test;

public class WrapperTest01 {
    public static void main(String[] args) {
    byte bityP = 1;
    short shortP = 1;
    int intP = 1;
    long longP = 10L;
    float floatP = 10F;
    double doubleP = 10D;
    char charP = 'W';
    boolean booleanP = true;

    Byte bityW = 1;
    Short shortW = 1;
    Integer intW = 1;
    Long longW = 10L;
    Float floatW = 10F;
    Double doubleW = 10D;
    Character charW = 'W';
    Boolean booleanW = true;

    int i = intW; // unboxing
    Integer intW2 = Integer.parseInt("1");
    boolean verdadeiro = Boolean.parseBoolean("trUe");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
