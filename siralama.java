import java.util.Scanner;
public class siralama {
    public static void main(String[] args) {
        int a,b,c,max,min,ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Siralanacak 3 sayi giriniz : ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        if (a>b && a>c) {
        max=a;
        if(b>c)
        {min=c;
        ort=b;}
        else 
        {min=b;
        ort=c;}
        System.out.println("Siralama:"+max+ort+min);
        }
        else if (b>a && b>c) {
            max=b;
            if(a>c)
            {min=c;
            ort=a;}
            else 
            {min=a;
            ort=c;}
            System.out.println("Siralama:"+max+ort+min);
            }
        else if (c>b && c>a) {
            max=c;
            if(b>c)
            {min=c;
            ort=b;}
            else 
            {min=b;
            ort=c;
            }
        System.out.println("Siralama:"+max+ort+min);}
        input.close();
            }

    }
