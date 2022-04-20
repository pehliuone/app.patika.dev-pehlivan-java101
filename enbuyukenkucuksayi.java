import java.util.Scanner;

public class enbuyukenkucuksayi {
	
	public static void main(String[] args) {
     
	 double min=0,max=0; 
	 Scanner scanner=new Scanner(System.in);

	 System.out.print("Kaç tane sayi gireceksiniz?: ");
	 double n=scanner.nextInt();
	 
	 if(n<=1) {
		 System.out.println("Girdiginiz sayi yetersiz.Lütfen daha fazla sayi giriniz");
         
	 }else {
		  
	 for(int i=1;i<=n;i++) {
		 System.out.print(i+". sayiyi giriniz:");
		 int number=scanner.nextInt();
		 if (i==1) {
			 min=number;
			 max=number;
			
		 }else {
			 if(number>=max) {
				 max=number;
			 }else {
				 min=number;
			 }
			
	      } 	
         
	      }
	    }
        System.out.println("En küçük sayi: " + min);
        System.out.println("En büyük sayi: " + max);
  scanner.close();
  }
}
