import java.util.Scanner;

public class kombinasyon {
    static int fact(int factNum) {
        int factResult = 1;

        for (int i = 1; i <= factNum; i++) {
            factResult *= i;
        }

        return factResult;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n sayisini gir: ");
        int n = input.nextInt();

        System.out.print("r sayisini gir: ");
        int r = input.nextInt();

        int result = fact(n) / (fact(r) * fact(n - r));

        System.out.print("C(" + n + "," + r + ") = " + result);
        input.close();
    }
}