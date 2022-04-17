import java.util.Scanner;
public class ortalama {
    public static void main(String[] args) throws Exception {
        System.out.println("Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik dersi");
        System.out.println("Not ortalamasi hesaplayan program");
        Scanner sc= new Scanner(System.in);
        System.out.println("Matematik notu gir:");
        int mat=sc.nextInt();
        System.out.println("Fizik notu gir:");
        int fiz=sc.nextInt();
        System.out.println("Kimya notu gir:");
        int kim=sc.nextInt();
        System.out.println("Türkçe notu gir:");
        int tur=sc.nextInt();
        System.out.println("Tarih notu gir:");
        int tar=sc.nextInt();
        System.out.println("Müzik notu gir:");
        int muz=sc.nextInt();
        System.out.println("Ortalama hesaplaniyor:");
        float ort=(mat+fiz+kim+tur+tar+muz)/6;
        System.out.println("Ortalama:"+ort);
        int sart=60;
        System.out.println((ort>sart) ? "Gectiniz" : "Kaldiniz" );
    }
}

