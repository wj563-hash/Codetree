import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        if (A < B) {
            System.out.printf("%d", B-A);
        }
        else {
            System.out.printf("%d", A-B);
        }
    }
}