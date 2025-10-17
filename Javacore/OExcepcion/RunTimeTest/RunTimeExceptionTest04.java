package MaratonaJava.Javacore.OExcepcion.RunTimeTest;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
        try
        {maybeThrowsException();
        }catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void maybeThrowsException() throws SQLException, FileNotFoundException {
    }
}