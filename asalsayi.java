public class asalsayi {
    public static void main(String[] args) {
        int sayi;

        for (sayi = 2; sayi <= 100; sayi++) {
            int durum = 1;

            for (int bol = 2; bol < sayi; bol++) {
                if (sayi % bol == 0) {
                    durum = 0;
                    break;
                }
            }
            if (durum == 1) {
                System.out.print(sayi + " ");
            }
        }
    }
}