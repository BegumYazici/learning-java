package basicexamples;

import java.util.Scanner;

/**
 * Created by asus1 on 6.10.2017.
 */
public class DikUcgen {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.print("Birinci kenari giriniz:");
        int kenar1=giris.nextInt();
        System.out.print("Ikinci kenari giriniz:");
        int kenar2=giris.nextInt();
        System.out.print("Ucuncu kenari giriniz:");
        int kenar3=giris.nextInt();

        int max=0;
        int a,b;

        if(kenar1>kenar2){
            if(kenar1>kenar3){
                max=kenar1;
                a=kenar3;
                b=kenar2;
            }else{
                max=kenar3;
                a=kenar1;
                b=kenar2;
            }
        }else{
            if(kenar2>kenar3){
                max=kenar2;
                a=kenar1;
                b=kenar3;
            }else{
                max=kenar3;
                a=kenar1;
                b=kenar2;
            }
        }

        if(Math.pow(max,2)== Math.pow(a,2)+ Math.pow(b,2)){
            System.out.println("Dik ucgendir.");
        }else{
            System.out.println("Dik ucgen degildir.");
        }
    }
}
