import java.util.Scanner;

public class mukemmelsayi {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }

        if (total == n) {
            System.out.println(n + " Mükemmel sayidir.");
        } else {
            System.out.println(n + " Mükemmel sayi degildir.");
        }

        
    }
    }
