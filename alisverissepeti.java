import java.util.Scanner;
public class alisverissepeti {
    public static void main(String[] args) throws Exception {
        System.out.println("Alisveris sepeti fiyati hesaplanacak");
        Scanner giris = new Scanner(System.in);
        System.out.println("Kac kilo armut?");
        Double armut=giris.nextDouble();
        Double armutfiyat=2.14*armut; 
        System.out.println("Kac kilo elma?");
        Double elma=giris.nextDouble();
        Double elmafiyat=3.67*elma; 
        System.out.println("Kac kilo domates?");
        Double domates=giris.nextDouble();
        Double domatesfiyat=1.11*domates; 
        System.out.println("Kac kilo muz?");
        Double muz=giris.nextDouble();
        Double muzfiyat=0.95*muz; 
        System.out.println("Kac kilo patlican?");
        Double patlican=giris.nextDouble();
        Double patlicanfiyat=5*patlican; 
        Double toplamtutar=armutfiyat+elmafiyat+domatesfiyat+muzfiyat+patlicanfiyat;
        System.out.println("Toplam tutar: "+toplamtutar);
}}