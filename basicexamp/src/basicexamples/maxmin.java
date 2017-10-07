package basicexamples;

import java.util.Scanner;

/**
 * Created by asus1 on 5.10.2017.
 */
public class MaxMin {

    public static void main(String[] args) {
        MaxMin obj = new MaxMin();
        obj.maxMinBul();
    }

    public void maxMinBul() {
        Scanner giris = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstVeriable = giris.nextInt();
        System.out.print("Enter the second number: ");
        int secondVeriable= giris.nextInt();
        System.out.print("Enter the third number: ");
        int thirdVeriable = giris.nextInt();
        int max = 0, min = 0;
        if (firstVeriable > thirdVeriable) {
            if (firstVeriable > secondVeriable) {
                max = firstVeriable;
            } else {
                max = secondVeriable;
            }

        } else {
            if (thirdVeriable > secondVeriable) {
                max = thirdVeriable;
            } else {
                max = secondVeriable;
            }
        }

        if (firstVeriable < thirdVeriable) {
            if (firstVeriable < secondVeriable) {
                min = firstVeriable;
            } else {
                min = secondVeriable;
            }

        } else {
            if (thirdVeriable < secondVeriable) {
                min = thirdVeriable;
            } else {
                min = secondVeriable;
            }
        }
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
