import java.util.Scanner;
public class daireninhesaplamasi {
    public static void main(String[] args) throws Exception {
        System.out.println("Çemberin çevresi ve alani hesaplanacak");
        System.out.println("Çember diliminin de alani hesaplanacak");
        for(;;)
        {System.out.println("Çemberin yariçapini giriniz:");
        Scanner cember = new Scanner(System.in);
        Double yaricap=cember.nextDouble();
        Double cevre=2*3.14*yaricap;
        Double alan=3.14*yaricap*yaricap;
        System.out.println("Çemberin çevresi " + cevre + " alani " +alan);
        System.out.println("Çemberin dilimi icin aci giriniz:");
        Double aci=cember.nextDouble();
        Double dilimalan=aci*yaricap*yaricap*3.14/360;
        System.out.println("Cemberin dilim alani "+dilimalan);}
}}