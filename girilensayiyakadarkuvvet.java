import java.util.Scanner;

public class girilensayiyakadarkuvvet {
    public static void main(String[] args) {
        int no;
        Scanner giris = new Scanner(System.in);

        System.out.print("Sayi gir:  ");
        no = giris.nextInt();

        int total = 1;

        for (int i = 1; i <= no;  i*=4 ){
            System.out.println("4un kuvvetleri: "+ i);
        }

        System.out.println("-------------------");

        for (int x = 1; x <= no; x *= 5){
            System.out.println("5in kuvvetleri: "+ x);
        }
    }
}