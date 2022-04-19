import java.util.Scanner;

public class usalma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int taban,us;
        System.out.print("Üssü alinacak sayiyi girin: ");
        taban= input.nextInt();
        System.out.print("Üs olacak sayiyi girin: ");
        us= input.nextByte();
        //3^4=3*3*3*3;
        int sonuc=1;
        for(int i=1;i<=us;i++){
            sonuc*=taban;
        }
            System.out.println(sonuc);
        input.close();
    }
}