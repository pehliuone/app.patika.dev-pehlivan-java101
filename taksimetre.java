import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) throws Exception {
        System.out.println("Taksimetre ücreti hesaplanacak");
        for(;;)
        {System.out.println("Kaç km gideceksiniz?");
        Scanner km= new Scanner(System.in);
        Double mesafe=km.nextDouble();
        if(10+2.2*mesafe <= 20)
        {
        System.out.println("Borcunuz 20 tldir");}
        else
        {
        Double borc=10+2.2*mesafe;
        System.out.printf("Borcunuz %2f tldir. ",borc);}
        }}
}