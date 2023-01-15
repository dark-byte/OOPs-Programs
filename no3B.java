import java.util.Scanner;

public class no3B {
 
    public static void main(String argsp[])
    {
        System.out.println("Enter two Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter Operator");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                int c = a + b;
                System.out.println(a + "+" + b + "=" + c);
                break;
            case '-':
                c = a - b;
                System.out.println(a + "+" + b + "=" + c);
                break;
            case '*':
                c = a * b;
                System.out.println(a + "*" + b + "=" + c);
                break;
            case '/':
                if(b == 0){
                    System.out.println("Cannot divide by 0!");
                }else{
                    float c1 = a/b;
                    System.out.println(a + "/" + b + "=" + c1);
                }
                break;
            default : System.out.println("Wrong operator!\n");
        }
    }
}
