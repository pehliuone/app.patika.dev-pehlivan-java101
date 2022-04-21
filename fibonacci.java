import java.util.Scanner;


public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Deger giriniz: ");
        long n= inp.nextInt();
        long sayi1=1,sayi2=1,sonuc=0;
        System.out.println(sayi1);
        System.out.println(sayi2);
        for (int i=0;i<n;i++){
         sonuc=sayi1+sayi2;
         sayi1=sayi2;
         sayi2=sonuc;
System.out.println(sonuc);
}
}
}