package Giris;

import java.util.Scanner;

public class DaireAlanVeÇevre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        System.out.print("Yarıçapı giriniz : ");
        r = input.nextInt();
        double daireAlan=Math.PI*r*r;
        double daireÇevre=2*Math.PI*r;
        System.out.println(daireAlan);
        System.out.println(daireÇevre);
    }
}
