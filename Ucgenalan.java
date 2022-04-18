import java.util.Scanner;
public class Ucgenalan{
    public static void main(String[] args) throws Exception {
        System.out.println("Ucgen icin 3 kenar uzunlugu giriniz");
        Scanner kenar =new Scanner(System.in);
        double a=kenar.nextDouble();
        double b=kenar.nextDouble();
        double c=kenar.nextDouble();
        double u=(a+b+c)/2;
        if((u-a)>0 && (u-b)>0 && (u-c)>0)
        {
        Double x=u-a;
        Double y=u-b;
        Double z=u-c;
        Double hesap=u*x*y*z;
        Double alan = Math.sqrt(hesap);
        System.out.println("U degeri "+ u);
        System.out.println("Ucgenin alani "+ alan);
    }
        else 
        {System.out.println("Uzunluklar hatali tekrar giriniz");}
        }
}
