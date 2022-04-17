import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) throws Exception {
        System.out.println("KDV Tutari hesaplanacak fiyat bilgisi giriniz;");
        Scanner sc=new Scanner(System.in);
        int fiyat=sc.nextInt();
        if(fiyat<=1000)
    {   Double kdvmiktari=fiyat*0.18;
        Double toplamfiyat=fiyat*1.18;
        System.out.println("KDV'siz Fiyat="+ fiyat + "  KDV'li Fiyat ="+ toplamfiyat +"  KDV tutari="+ kdvmiktari);
    } 
        else
    {   Double kdvmiktari=fiyat*0.08;
        Double toplamfiyat=fiyat*1.08;
        System.out.println("KDV'siz Fiyat="+ fiyat + "  KDV'li Fiyat ="+ toplamfiyat +"  KDV tutari="+ kdvmiktari);
    }
}}
