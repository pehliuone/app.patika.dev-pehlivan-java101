import java.util.Scanner;
public class vucutkitleendeksi {
    public static void main(String[] args) throws Exception {
        System.out.println("Vucut kitle endeksi hesaplanacak");
        for(;;)
        {System.out.println("Boyunuzu giriniz:");
        Scanner giris = new Scanner(System.in);
        Double boy=giris.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        Double kilo=giris.nextDouble();
        Double endeks=kilo/(boy*boy);
        System.out.println("Vucut kitle endeksiniz: "+endeks);}
}}
