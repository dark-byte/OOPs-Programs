package TimeConverter;
import java.util.Scanner;

public class timeConverter {

    double hour, min, sec;
    public void hoursToMin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours-");
        hour = sc.nextDouble();
        min = hour*60;
        System.out.printf("%f Hours = %f Minutes\n", hour, min);
    }

    public void hoursToSec() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours-");
        hour = sc.nextDouble();
        sec = hour * 60 * 60;
        System.out.printf("%f Hours = %f Seconds\n", hour, sec);
    }

    public void ninToHour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Minutes-");
        min= sc.nextDouble();
        hour = min / 60;
        System.out.printf("%f Minutes = %f Hours\n", min, hour);
    }

    public void secToHour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds-");
        sec = sc.nextDouble();
        hour = sec / 3600;
        System.out.printf("%f Seconds = %f Hours\n", sec, hour);

    }
}
