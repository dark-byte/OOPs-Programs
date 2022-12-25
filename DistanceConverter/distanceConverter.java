package DistanceConverter;
import java.util.Scanner;

public class distanceConverter {

    double meter, mile, km;

    public void meterToKm()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in Meter-");
        meter = sc.nextDouble();
        km = meter/1000;
        System.out.printf("%f Meter = %f Kilometers\n", meter, km);
    }

    public void mileToKm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in Miles-");
        mile = sc.nextDouble();
        km = mile * 1.60934;
        System.out.printf("%f Miles = %f Kilometers\n",mile, km);
    }

    public void kmToMeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in Kilometer-");
        km = sc.nextDouble();
        meter = km * 1000;
        System.out.printf("%f Kilometer = %f Meter\n",km, meter );
    }

    public void kmToMile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in Kilometer-");
        km = sc.nextDouble();
        mile = km * 1000;
        System.out.printf("%f Kilometer = %f Miles\n", km, mile);
    }
}
