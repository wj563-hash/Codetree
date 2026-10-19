import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();

        System.out.print(B > A && B < C? 1:0);
    }
}