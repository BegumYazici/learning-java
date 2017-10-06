package basicexamples;

import java.util.Scanner;

/**
 * Created by asus1 on 6.10.2017.
 */
public class overtime {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.print("Saat sayisini giriniz: ");
        int hour1=entry.nextInt();
        int mesaiUcreti = 0;

        if(hour1<=10){
            mesaiUcreti=hour1*1;
        }
        else if (hour1<=20){
            mesaiUcreti=hour1*2;
        }
        else if(hour1<=40){
            mesaiUcreti=hour1*3;
        }
        else if(hour1<=100){
            mesaiUcreti=hour1*4;
        }
        else if(hour1>100){
            mesaiUcreti=hour1*5;
        }

        System.out.println("Mesai ucretiniz: "+ mesaiUcreti);
}
