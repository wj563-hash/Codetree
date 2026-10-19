import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A_ma = sc.nextInt(), A_en = sc.nextInt();
        int B_ma = sc.nextInt(), B_en = sc.nextInt();


        System.out.print(A_ma > B_ma ? 'A': A_ma <  B_ma ? 'B': A_ma == B_ma && A_en > B_en ? 'A':'B');
    }
}