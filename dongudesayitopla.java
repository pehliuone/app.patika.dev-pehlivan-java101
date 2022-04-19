import java.util.Scanner;
public class dongudesayitopla {
    public static void main(String[] args) {
        int sayi,hesap=0;
        double toplam=0;
        Scanner gir= new Scanner(System.in);
        do
        {
            System.out.print("Sayi giriniz: ");
            sayi= gir.nextInt();
            if (sayi%4==0) {
                toplam+=sayi;
                hesap++;
            }
        }
        while (sayi%2==0);
        gir.close();
        System.out.println("\n 4'e tam bolunen sayilarin toplami: " +toplam+ " ortalamasi: "+ toplam / hesap);
    }
}