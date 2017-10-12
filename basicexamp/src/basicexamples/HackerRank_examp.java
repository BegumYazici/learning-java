package basicexamples;

import java.util.Scanner;

/**
 * Created by asus1 on 10.10.2017.
 */
public class HackerRank_examp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
        String inputString = scan.nextLine(); // read a line of input and save it to a variable
        scan.close(); // close the scanner

        // Your first line of output goes here
        System.out.println("Hello, World.");

        System.out.println(inputString);
    }
}

