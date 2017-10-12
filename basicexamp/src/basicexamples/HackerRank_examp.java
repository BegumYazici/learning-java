package basicexamples;

import java.util.Scanner;

/**
 * Created by asus1 on 10.10.2017.
 */
public class HackerRank_examp {

    public static void main(String[] args) {
    /*    Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Calculate Tax and Tip:
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tax + tip);

        System.out.println("The total meal cost is " + totalCost + " dollars."); */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String ans = "";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        do  {
            if (n % 2 == 1) {
                ans = "Weird";
            } else {
                ans = "Not Weird";

            }
            System.out.println(ans);
            if(n==24){
                break;
            }
            n = scan.nextInt();
        }
        while(n==24);
        scan.close();
    }
}


