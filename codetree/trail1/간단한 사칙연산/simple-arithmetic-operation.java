import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        System.out.printf("%d\n%d\n%d\n%d", A+B, A-B, A/B, A%B);
    }
}