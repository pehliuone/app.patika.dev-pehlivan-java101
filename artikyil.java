import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
        int yil,sonuc;

        Scanner gir = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        yil = gir.nextInt();

        if (yil % 4 == 0){
            if (yil % 100 != 0){
                System.out.println(yil +" artik bir yil!");
            }else if ((yil % 100 == 0) && (yil % 400 == 0)){
                System.out.println(yil + " artik bir yil!");
            }else{
                System.out.println(yil + " artik bir yil degil!!");
            }
        }else{
            System.out.println(yil + " artik bir yil degil!!");
        }


    }
}