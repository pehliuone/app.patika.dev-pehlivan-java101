import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class hesapmakinesi {
    public static void main(String[] args){
        double sayi1, sayi2;
        String islem;
        for(;;)
        {Scanner input = new Scanner(System.in);
        System.out.println("Yapmak istediginiz islemi seciniz.\n1. Toplama icin P\t\t2. Cikarma icin M\n3. Carpma icin T\t\t4. Bolme icin D ");
        System.out.print("Sectiginiz islemi yaziniz: ");
        islem = input.nextLine();
        System.out.print("Ilk sayiyi giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        sayi2 = input.nextInt();
        switch (islem){
            case "P":
                System.out.println("Toplama islemini tercih ettiniz.");
                System.out.print("Toplama islemi sonucunuz: " + (sayi1+sayi2)+ "\n");
                break;
            case "M":
                System.out.println("Cikarma islemini tercih ettiniz.");
                System.out.print("Cikarma islemi sonucunuz: " + (sayi1-sayi2)+ "\n");
                break;
            case "T":
                System.out.println("Carpma islemini tercih ettiniz.");
                System.out.print("Carpma islemi sonucunuz: " + (sayi1*sayi2)+ "\n");
                break;
            case "D":
                System.out.println("Bolme islemini tercih ettiniz.");
                double bolme=(sayi1/sayi2);
                System.out.print(sayi2 == 0 ? "Tanimsiz" : "Bolme islemi sonucunuz: " + bolme + "\n");
                break;
            default:
                System.out.print("Hatali bir islem seçtiniz!\n");
                break;
        }
    }
}}

