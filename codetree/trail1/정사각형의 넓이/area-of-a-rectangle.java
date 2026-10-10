import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N >= 5) {
            System.out.printf("%d", N*N);
        }
        else {
            System.out.printf("%d\ntiny", N*N);
        }
    }
}