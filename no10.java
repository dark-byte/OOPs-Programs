import java.util.*;

public class no10 {
    int c;
    void divide(int a, int b) {
        try {
            c = a / b;
            System.out.println("Result=" + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String args[]) 
    {
        no10 obj = new no10();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        obj.divide(n1, n2);
    }
}