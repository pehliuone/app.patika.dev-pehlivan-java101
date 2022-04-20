import java.util.Scanner;

public class ebobekok {

	public static void main(String[] args) {
		Scanner tara = new Scanner(System.in);
		int n1, n2, sayac = 1, ebob = 1;
		System.out.print("Ilk sayiyi giriniz: ");
		n1 = tara.nextInt();
		System.out.print("Ikinci sayiyi giriniz: ");
		n2 = tara.nextInt();

		while (true) {
			sayac++;
			if (n1 > n2) { 
				if (n2 % sayac == 0 && n1 % sayac == 0) {
					if (ebob <= n2) {
						ebob = sayac;
					}
				}
			} else {
				if (n2 % sayac == 0 && n1 % sayac == 0) {
					if (ebob <= n1) {
						ebob = sayac;
					}
				}
			}
			if (sayac == n1 || sayac == n2)
				break;
		}
		System.out.println("Ebob : " + ebob + "\n" + "Ekok : " + (n1 * n2) / ebob);
        tara.close();
	}
}