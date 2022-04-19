import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {
        String username, password, name= "patika", pw="1234",temp;
        int select;
        Scanner inp = new Scanner(System.in);
        Scanner gir = new Scanner(System.in);
    
        System.out.print("Kullanici Adiniz: ");
        username = inp.nextLine();
        System.out.print("Sifreniz: ");
        password = inp.nextLine();
          if (username.equals(name) && password.equals(pw)) {
            System.out.print("Giris yaptiniz.Tebrikler!Cikis icin 4 sayisini giriniz: ");
        } else if (!username.equals(name) && password.equals(pw)) {
            System.out.print("Kullanici adinizi yanlis girdiniz.\n");
            System.out.print("Kullanici adinizi sifirlamak istiyor musunuz?Evet icin 2 cikis icin 4 sayinizi giriniz: ");
        } else if (username.equals(name) && !password.equals(pw)){
            System.out.print("Sifrenizi yanlis girdiniz.\nSifrenizi sifirlamak istiyor musunuz?Evet icin 1 e hayir icin 4 e basiniz: ");
        } else{
            System.out.print("Kullanici adinizi ve sifrenizi yanlis girdiniz.\nDegistirmek icin 3 cikis icin 4 sayisini giriniz: ");
        }
        select = inp.nextInt();
        switch (select){
            case 1:
                 System.out.print("Yeni sifrenizi giriniz: ");
                password = gir.nextLine();
                if (password.equals(pw)) {
                    System.out.println("Sifre olusturulamadı lutfen baska sifre giriniz: ");
                }else {
                    temp=pw;
                    pw=password;
                    password=temp;
                    System.out.println("Sifre olusturuldu.");
                }
                break;
            case 2:
                System.out.print("Yeni kullanici adinizi giriniz: ");
                username = gir.nextLine();
                if (username.equals(pw)) {
                    System.out.println("Kullanici adi olusturulamadı lutfen baska kullanici adi giriniz:");
                }else {
                    temp=name;
                    name=username;
                    username=temp;
                    System.out.println("Kullanici adi olusturuldu");
                }
                break;
            case 3:
            System.out.print("Yeni kullanici adinizi giriniz: ");
            username = gir.nextLine();
            if (username.equals(pw)) {
                System.out.println("Kullanici adi olusturulamadı lutfen baska kullanici adi giriniz.");
            }else {
                temp=name;
                name=username;
                username=temp;
                System.out.println("Kullanici adi olusturuldu.");
            }
            System.out.print("Yeni sifrenizi giriniz: ");
            password = gir.nextLine();
            if (password.equals(pw)) {
                System.out.println("Sifre olusturulamadı lutfen baska sifre giriniz: ");
            }else {
                temp=pw;
                pw=password;
                password=temp;
                System.out.println("Sifre olusturuldu.");
            }
            System.out.print("Kullanici adinizi ve sifrenizi girdiniz.\n");
            System.out.println("Cikis yapildi.");
                break;
            case 4:
                System.out.println("Cikis yapildi.");
                break;
            default:
                System.out.println("Gecersiz islem secimi yapildi.");
        }
        inp.close();
        gir.close();
        System.out.println("Kullanici adiniz:" + name + " Sifreniz:" + pw); 
}
}
