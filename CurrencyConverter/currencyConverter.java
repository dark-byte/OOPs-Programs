package CurrencyConverter;
import java.util.Scanner;

public class currencyConverter {

    double inr, usd, yen, euro;

    public void inrToUsd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INR amount-");
        inr = sc.nextDouble();
        usd = inr*82.6;
        System.err.printf("%f INR = %f USD\n", inr, usd);
    } 

    public void inrToYen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INR amount-");
        inr = sc.nextDouble();
        yen = inr*0.62;
        System.out.printf("%f INR = %f YEN\n", inr, yen);
    }

    public void inrToEuro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INR amount-");
        inr = sc.nextDouble();
        euro = inr * 88.1;
        System.out.printf("%f INR = %f EURO\n", inr, euro);
    }

    public void usdToInr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD amount-");
        usd = sc.nextDouble();
        inr = usd/82.6;
        System.out.printf("%f USD = %f INR\n",usd, inr);
    }

    public void yenToInr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter YEN amount-");
        yen = sc.nextDouble();
        inr = usd / 0.62;
        System.out.printf("%f YEN = %f INR\n", yen, inr);
    }

    public void euroToInr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EURO amount-");
        euro = sc.nextDouble();
        inr = usd / 88.1;
        System.out.printf("%f EURO = %f INR\n", euro, inr);
    }

}
