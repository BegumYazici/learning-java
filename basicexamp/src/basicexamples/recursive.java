package basicexamples;

import java.util.Scanner;

/**
 * Created by asus1 on 6.10.2017.
 */
public class recursive {

        int f(int x){
            if(x==1) {
                return 1;
            }else{
                return x*f(x-1);
            }
        }

        public static void main(String[] args) {

            recursive obj = new recursive();
            Scanner giris= new Scanner(System.in);
            System.out.print("Sayi giriniz:");
            int a =giris.nextInt();

            System.out.println("Faktoriyel sonucu: "+ obj.f(a));
        }
    }

