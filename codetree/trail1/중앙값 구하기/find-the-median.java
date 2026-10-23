import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        if (A >= B && A >= C) {
            System.out.print(B >= C?B:C);
            return;
        }

        if (B >= C && B >= A) {
            System.out.print(C >= A?C:A);
            return;
        }

        if (C >= B && C >= A) {
            System.out.print(B >= A?B:A);
            return;
        }
    }
}