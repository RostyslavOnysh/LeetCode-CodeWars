package hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavExceptionHandlingTryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println( x / y);
        } catch (InputMismatchException e)  {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } finally {
            sc.close();
        }
    }
}