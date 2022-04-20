import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        String kullaniciadi,sifre;
        Scanner gir = new Scanner(System.in);
        int hak=3,bakiye=0,sec,para;
        boolean a=true,temp;
        while (hak > 0) {
            System.out.print("Kullanici Adiniz :");
            kullaniciadi = gir.nextLine();
            System.out.print("Parolaniz : ");
            sifre= gir.nextLine();

            if (kullaniciadi.equals("ahmet") && sifre.equals("pehlivan"))
                {
                System.out.println("Merhaba Pehlivan Bankasina Hosgeldiniz!");
                    
                while(a)
                {
                    System.out.println("\n"
                            +"1-Para yatirma\n" +
                            "2-Para Cekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Cikis Yap");
                    System.out.print("Lütfen yapmak istediginiz islemi seciniz : ");
                    sec = gir.nextInt();
                switch (sec) 
                        {
                case 1:
                        para = gir.nextInt();
                        System.out.print(para +" lira para yatiriyorsunuz");
                        bakiye += para;
                        System.out.print("\nPara miktari : "+bakiye);
                        break;

                case 2:
                        para = gir.nextInt();
                        System.out.print(para +" lira para cekiyorsunuz");
                        if (para > bakiye) 
                        {
                        System.out.print("\nPara miktari : "+bakiye);
                        System.out.println("\nBakiye yetersiz.");
                        } 
                        else 
                        {
                        bakiye -= para;
                        System.out.print("\nPara miktari : "+bakiye);
                        }
                        break;
                case 3:   
                        System.out.print(" Bakiye sorguluyorsunuz");
                        System.out.println("\nBakiyeniz : " + bakiye);
                        break;
                case 4:

                        System.out.println("Tekrar görüsmek üzere.Hoscakalin!");
                        temp=a;
                        a=false;
                        break; 
                default: 
                        break;
                        }}}
                
            else{    
            System.out.println("Hatali kullanici adi veya sifre.");
            hak--;
                if (hak== 0) {
                    System.out.println("Hesabiniz bloke olmustur lütfen banka ile iletisime geciniz.");
                } 
                else {
                    System.out.println("Kalan Hakkiniz : " + hak);
                }
            }
            
        }
            gir.close();
        }
    }
