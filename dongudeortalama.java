import java.util.Scanner;

public class dongudeortalama {
    public static void main(String[] args) {

        int sayi,hesap = 0;
        double toplam=0;
        Scanner gir = new Scanner(System.in);
        System.out.print("sayi: ");
        sayi= gir.nextInt();

        System.out.println("3 ve 4'e tam bolunen sayilar: ");

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                hesap++;
                System.out.print(" " + i);
            }
        }
        System.out.println("\n 3 ve 4'e tam bolunen sayilarin ortalamasi: " + toplam / hesap);
    }
}
