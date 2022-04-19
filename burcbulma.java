import java.util.Scanner;

public class burcbulma {
    public static void main(String[] args) {
        int ay,gün;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dogdugunuz ayi giriniz:");
        ay=sc.nextInt();
        System.out.println("Dogdugunuz gunu giriniz:");
        gün=sc.nextInt();
        if (ay==1){
            if (gün>=1 && gün<31)
            if (gün<22){
                System.out.println("Oglak Burcu");
            }
            else {
                System.out.println("Kova Burcu");
            }
        }
        else if (ay == 2){
            if (gün>=1 && gün<=28)
                if (gün<20){
                    System.out.println("Kova Burcu");
                }
                else {
                    System.out.println("Balık Burcu");
                }
        }
        else if (ay == 3){
            if (gün>=1 && gün<=31)
                if (gün<20){
                    System.out.println("Balık Burcu");
                }
                else {
                    System.out.println("Koc Burcu");
                }
        }
        else if (ay == 4){
            if (gün>=1 && gün<=30)
                if (gün<20){
                    System.out.println("Koc Burcu");
                }
                else {
                    System.out.println("Boga Burcu");
                }
        }
        else if (ay == 5){
            if (gün>=1 && gün<=31)
                if (gün<21){
                    System.out.println("Boga Burcu");
                }
                else {
                    System.out.println("Ikizler Burcu");
                }
        }
        else if (ay == 6){
            if (gün>=1 && gün<=30)
                if (gün<22){
                    System.out.println("Ikizler Burcu");
                }
                else {
                    System.out.println("Yengec Burcu");
                }
        }


        else if (ay == 7){
            if (gün>=1 && gün<=31)
                if (gün<22){
                    System.out.println("Yengec Burcu");
                }
                else {
                    System.out.println("Aslan Burcu");
                }
        }
        else if (ay == 8){
            if (gün>=1 && gün<=30)
                if (gün<22){
                    System.out.println("Aslan Burcu");
                }
                else {
                    System.out.println("Basak Burcu");
                }
        }
        else if (ay == 9){
            if (gün>=1 && gün<=31)
                if (gün<22){
                    System.out.println("Basak Burcu");
                }
                else {
                    System.out.println("Terazi Burcu");
                }
        }
        else if (ay == 10){
            if (gün>=1 && gün<=30)
                if (gün<22){
                    System.out.println("Terazi Burcu");
                }
                else {
                    System.out.println("Akrep Burcu");
                }
        }
        else if (ay == 11){
            if (gün>=1 && gün<=31)
                if (gün<22){
                    System.out.println("Akrep Burcu");
                }
                else {
                    System.out.println("Yay Burcu");
                }
        }
        else if (ay == 12){
            if (gün>=1 && gün<=31)
                if (gün<22){
                    System.out.println("Yay Burcu");
                }
                else {
                    System.out.println("Oglak Burcu");
                }
        }

sc.close();
    }
}