package MaratonaJava.Javacore.QString.Test;

public class StringBuilderTest {
    static void main() {
        StringBuilder sb = new StringBuilder("Spolay");
        sb.append( " promessa do Java");
        sb.append(" de Dom pro mundo");
        sb.reverse();
        System.out.println(sb);
        sb.reverse();

        System.out.println(sb);
    }
}
