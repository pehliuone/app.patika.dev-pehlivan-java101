import java.util.Scanner;

public class basamaksayilari {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        long sayi = gir.nextInt();
        int bassayi=0;
        int bastop=0;
        long basgecici;

        while (sayi!= 0 && sayi>0) {
            basgecici=sayi%10;
            bastop+=basgecici;
            sayi/=10;
            bassayi++;
        }
    
        System.out.println("Girdiginiz " + bassayi + " basamakli pozitif tamsayinin basamaklari toplami:"+ bastop);
        gir.close();
}}