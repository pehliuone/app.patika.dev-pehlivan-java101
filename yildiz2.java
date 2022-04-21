import java.util.Scanner;

public class yildiz2 {
    public static void main(String[] args) {
        // Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
        //yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

        //satır=n 1 2 3 4 5
        //boşluk=i-1; 1 2 3 4 5 6 7
        /*
           yıldız= 9-7-5-3-1
         */


        Scanner gir = new Scanner(System.in);
        System.out.println("Deger giriniz: ");
        int n = gir.nextInt();


        for (int i=1;i<=n;i++){
            for (int k=0;k<=i;k++) {
                System.out.print(" ");
            }
            for (int j=n*2-1;j>=i*2-1;j--){
                System.out.print("*");
            }

            System.out.println(" ");

        }
        gir.close();
    }
}