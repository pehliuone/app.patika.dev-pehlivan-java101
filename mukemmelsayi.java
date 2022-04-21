import java.util.Scanner;

public class mukemmelsayi {
    public static void main(String[] args) {
        int n, toplam = 0;
        Scanner tara = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        n = tara.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }

        if (toplam == n) {
            System.out.println(n + " Mükemmel sayidir.");
        } else {
            System.out.println(n + " Mükemmel sayi degildir.");
        }

        
    }
    }
