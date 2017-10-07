package basicexamples;

import java.util.Scanner;

/**
 * Created by asus1 on 6.10.2017.
 */
public class Recursive {

    int f(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * f(x - 1);
        }
    }

    public static void main(String[] args) {

        Recursive obj = new Recursive();
        Scanner giris = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = giris.nextInt();

        System.out.println("Factorial result: " + obj.f(number));
    }
}
