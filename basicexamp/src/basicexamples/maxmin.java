package basicexamples;

import java.util.Scanner;

/**
 * Created by asus1 on 5.10.2017.
 */
public class maxmin {

    public static void main(String[] args) {
        maxmin obj = new maxmin();
        obj.maxMinBul();
    }

    public void maxMinBul() {

        Scanner giris = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz:");
        int x = giris.nextInt();
        System.out.println("2. sayiyi giriniz:");
        int y = giris.nextInt();
        System.out.println("3. sayiyi giriniz:");
        int z = giris.nextInt();
        int max = 0, min = 0;
        if (x > z) {
            if (x > y) {
                max = x;
            } else {
                max = y;
            }

        } else {
            if (z > y) {
                max = z;
            } else {
                max = y;
            }
        }

        if (x < z) {
            if (x < y) {
                min = x;
            } else {
                min = y;
            }

        } else {
            if (z < y) {
                min = z;
            } else {
                min = y;
            }
        }
        System.out.println("min sayi: " + min);
        System.out.println("max sayi: " + max);
    }
}
