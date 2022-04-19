import java.util.Scanner;
public class dersnotu {
    public static void main(String[] args) throws Exception {
        int not,count=0,toplam=0;
        double ortalama;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ders notlari girilecek.");
        System.out.println("Fizik notu gir:");
        not=sc.nextInt();
        if(not>=0 && not<=100)
        {count++;
        toplam+=not;}
        System.out.println("Kimya notu gir:");
        not=sc.nextInt();
        if(not>=0 && not<=100)
        {count++;
        toplam+=not;}
        System.out.println("Turkce notu gir:");
        not=sc.nextInt();
        if(not>=0 && not<=100)
        {count++;
        toplam+=not;}
        System.out.println("Matematik notu gir:");
        not=sc.nextInt();
        if(not>=0 && not<=100)
        {count++;
        toplam+=not;}
        System.out.println("Muzik notu gir:");
        not=sc.nextInt();
        if(not>=0 && not<=100)
        {count++;
        toplam+=not;}
        ortalama=toplam/count;
        if(ortalama>=55)
        {System.out.println("Sinifi gectiniz! Ortalamaniz "+ ortalama);}
        else
        {System.out.println("Sinifta kaldiniz");}
        sc.close();
    }
}
