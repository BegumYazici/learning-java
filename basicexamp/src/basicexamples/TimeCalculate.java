package basicexamples;

import java.util.Scanner;

/**
 * Created by asus1 on 6.10.2017.
 */
public class TimeCalculate {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.print("Saati giriniz: ");
        int hour1=entry.nextInt();
        System.out.print("Dakikayi giriniz: ");
        int minute1=entry.nextInt();
        System.out.print("Fark(dk) giriniz: ");
        int differenceMinute=entry.nextInt();

        int minute2=differenceMinute%60;
        int hour2=differenceMinute/60;

        int sumHour=hour1+hour2;
        if((sumHour>24)){
            sumHour = sumHour - 24;
        }

        int sumMinute=minute1+minute2;
        if(sumMinute>60){
            sumMinute=sumMinute-60;
        }

        System.out.println("Sonuc: "+sumHour+"."+sumMinute);
    }
}
