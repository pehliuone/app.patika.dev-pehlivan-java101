import java.util.Scanner;

public class cinzodyak {
    public static void main(String[] args) {
        System.out.println("Cin zodyagi icin dogum yilinizi giriniz");
        Scanner tara = new Scanner(System.in);

        int gun = tara.nextInt();
        String[] hayvanlar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Okuz", "Kaplan", "Tavsan", "Ejderha", "Yilan", "At", "Koyun"};

        int sonuc = gun % 12;
        System.out.println("Cin zodyagi burcunuz "+hayvanlar[sonuc]);
    }}