import java.util.Scanner;

public class no3A {

    public static void main(String args[])
    {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
                System.out.println(n + " is not Prime");
                return;
            }
        }
        
        System.out.println(n+" is Prime");
    }
}
