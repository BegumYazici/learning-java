package basicexamples;

import java.util.Scanner;

/**
 * Created by asus1 on 7.10.2017.
 */
public class Overtime {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.print("Enter the number of hours: ");
        int hour1 = entry.nextInt();
        int overTime = 0;

        if (hour1 <= 10) {
            overTime = hour1 * 1;
        } else if (hour1 <= 20) {
            overTime = hour1 * 2;
        } else if (hour1 <= 40) {
            overTime = hour1 * 3;
        } else if (hour1 <= 100) {
            overTime = hour1 * 4;
        } else if (hour1 > 100) {
            overTime = hour1 * 5;
        }

        System.out.println("The working fee: " + overTime);
    }
}