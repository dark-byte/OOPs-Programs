import CurrencyConverter.*;
import TimeConverter.*;
import DistanceConverter.*;

public class no6 {
    public static void main(String args[]){
        currencyConverter cc = new currencyConverter();
        cc.usdToInr();
        
        timeConverter tc = new timeConverter();
        tc.hoursToSec();

        distanceConverter dc = new distanceConverter();
        dc.meterToKm();
    }
}
